package com.company;

import java.io.*;
import java.text.NumberFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Podaj ile liczb wylosować!");
        int howManyNumbers = myScanner.nextInt();
        System.out.println("Podaj średnią!");
        double mean = myScanner.nextDouble();
        System.out.println("Podaj odchylenie standardowe!");
        double deviation = myScanner.nextDouble();
        while(deviation < 0 ) {
            System.out.println("Podaj poprawne odchylenie standardowe!");
            deviation = myScanner.nextDouble();
        }

        List<Double> generatedNumbers = generateGuassianNumbers(howManyNumbers, mean, deviation);
        System.out.println(generatedNumbers);

        FileOutputStream fileOutputStream = new FileOutputStream("binaryData");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        for (Double number : generatedNumbers) {
            objectOutputStream.writeObject(number);
        }

        FileInputStream fileInputStream = new FileInputStream("binaryData");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        FileWriter fw = new FileWriter("textData.txt", false);
        BufferedWriter bw = new BufferedWriter(fw);

        for (int i = 0; i < howManyNumbers; i++){
            Double current = (Double) objectInputStream.readObject();
            System.out.println(current);
            Locale locale = new Locale("pl", "PL");
            NumberFormat numberFormat = NumberFormat.getInstance(locale);
            String toWrite = numberFormat.format(current);
            bw.write(toWrite);
            bw.newLine();
        }

        bw.close();
        objectInputStream.close();
        objectOutputStream.close();

    }

    public static Double getNextGuassian(Double mean, Double deviation) {
        Random r = new Random();
        return r.nextGaussian()*deviation+mean;
    }

    public static List<Double> generateGuassianNumbers(int numbersCount, Double mean, Double deviation) {
        List<Double> myList = new ArrayList<>();
        for (int i = 0; i < numbersCount; i++) {
            myList.add(getNextGuassian(mean, deviation));
        }
        return myList;
    }
}
