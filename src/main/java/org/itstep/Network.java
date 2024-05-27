package org.itstep;

import java.util.ArrayList;

public class Network
{

    public void eduNetwork() {
        echoNetwork();

        for (int i = 0; i < 50000; i++) {
            setIndikatorOne();
            one.setExpected(1);
            one.correctWeight();
            seven.setExpected(0);
            seven.correctWeight();

            setIndikatorTwo();
            two.setExpected(1);
            two.correctWeight();


            setIndikatorThree();
            two.setExpected(1);
            two.correctWeight();


            setIndikatorFour();
            two.setExpected(1);
            two.correctWeight();

            setIndikatorFive();
            two.setExpected(1);
            two.correctWeight();

            setIndikatorSix();
            two.setExpected(1);
            two.correctWeight();


            setIndikatorSeven();
            one.setExpected(0);
            one.correctWeight();
            seven.setExpected(1);
            seven.correctWeight();






        }

        echoNetwork();
    }


    public void testNetwork() {
        setIndikatorOne();
        echoIndikator();
        one.calcSum();
        System.out.print(one.getSum() + " ");
        if(one.getResult() == 1) {
            System.out.println("One");
        } else {
            System.out.println("Not One");
        }
        seven.calcSum();
        System.out.print(seven.getSum() + " ");
        if(seven.getResult() == 1) {
            System.out.println("Seven");
        } else {
            System.out.println("Not Seven");
        }

        System.out.println(" + ------------ +");


        setIndikatorTwo();
        echoIndikator();
        two.calcSum();
        System.out.print(two.getSum() + " ");
        if (two.getResult() == 1) {
            System.out.println("Two");
        } else {
            System.out.println("Not Two");
        }



        System.out.println(" + ------------ +");

        setIndikatorThree();
        echoIndikator();
        three.calcSum();
        System.out.print(three.getSum() + " ");
        if (three.getResult() == 1) {
            System.out.println("Three");
        } else {
            System.out.println("Not Three");
        }


        System.out.println(" + ------------ +");

        setIndikatorFour();
        echoIndikator();
        four.calcSum();
        System.out.print(four.getSum() + " ");
        if (four.getResult() == 1) {
            System.out.println("Four");
        } else {
            System.out.println("Not Four");
        }



        System.out.println(" + ------------ +");

        setIndikatorFive();
        echoIndikator();
        five.calcSum();
        System.out.print(five.getSum() + " ");
        if (five.getResult() == 1) {
            System.out.println("Five");
        } else {
            System.out.println("Not Five");
        }



        System.out.println(" + ------------ +");

        setIndikatorSix();
        echoIndikator();
        six.calcSum();
        System.out.print(six.getSum() + " ");
        if (six.getResult() == 1) {
            System.out.println("Six");
        } else {
            System.out.println("Not Six");
        }





        System.out.println(" + ------------ +");

        setIndikatorSeven();
        echoIndikator();
        one.calcSum();
        System.out.print(one.getSum() + " ");
        if(one.getResult() == 1) {
            System.out.println("One");
        } else {
            System.out.println("Not One");
        }
        seven.calcSum();
        System.out.print(seven.getSum() + " ");
        if(seven.getResult() == 1) {
            System.out.println("Seven");
        } else {
            System.out.println("Not Seven");
        }

    }




    public Network() {
        buildIndikator();
        buildNumeric();
    }

    ArrayList<Neuron> indikator;
    ArrayList<Neuron> numeric;

    /**
     * Строим 7 разрядный индикатор
     */
    public void buildIndikator()
    {
        indikator = new ArrayList<>();
        indikator.add(new Neuron("a", true));
        indikator.add(new Neuron("b", true));
        indikator.add(new Neuron("c", true));
        indikator.add(new Neuron("d", true));
        indikator.add(new Neuron("e", true));
        indikator.add(new Neuron("f", true));
        indikator.add(new Neuron("g", true));

        indikator.add(new Neuron("h", true));
    }

    /**
     * Строим элементы (1 2 3 и тд - которые будут вычислять говорить, что это зачисло
     */
    public void buildNumeric(){
        numeric = new ArrayList<>();

        // 1
        one = new Neuron("One", false);
        one.setNeurons(indikator);
        one.randomWeights();
        numeric.add(one);

        // 2
         two = new Neuron("Two", false);
        two.setNeurons(indikator);
        two.randomWeights();
        numeric.add(two);

// 3
         three = new Neuron("Three", false);
        three.setNeurons(indikator);
        three.randomWeights();
        numeric.add(three);

// 4
         four = new Neuron("Four", false);
        four.setNeurons(indikator);
        four.randomWeights();
        numeric.add(four);

// 5
         five = new Neuron("Five", false);
        five.setNeurons(indikator);
        five.randomWeights();
        numeric.add(five);

// 6
         six = new Neuron("Six", false);
        six.setNeurons(indikator);
        six.randomWeights();
        numeric.add(six);


        // 7
        seven = new Neuron("Seven", false);
        seven.setNeurons(indikator);
        seven.randomWeights();
        numeric.add(seven);
    }

    Neuron one;
    Neuron two;
    Neuron three;
    Neuron four;
    Neuron five;
    Neuron six;
    Neuron seven;

    /**
     * Вывести состояние сети
     */
    public void echoNetwork() {
        for (Neuron neuron : numeric) {
            System.out.println(neuron);
        }
    }


    public void setIndikatorOne(){
        indikator.get(0).setResult(0); // a
        indikator.get(1).setResult(1); // b
        indikator.get(2).setResult(1); // c
        indikator.get(3).setResult(0); // d
        indikator.get(4).setResult(0); // e
        indikator.get(5).setResult(0); // f
        indikator.get(6).setResult(0); // g
        indikator.get(7).setResult(1); // h
    }

    public void setIndikatorTwo(){
        indikator.get(0).setResult(0); // a
        indikator.get(1).setResult(1); // b
        indikator.get(2).setResult(1); // c
        indikator.get(3).setResult(0); // d
        indikator.get(4).setResult(0); // e
        indikator.get(5).setResult(0); // f
        indikator.get(6).setResult(0); // g
        indikator.get(7).setResult(1); // h
    }

    public void setIndikatorThree(){
        indikator.get(0).setResult(0); // a
        indikator.get(1).setResult(1); // b
        indikator.get(2).setResult(1); // c
        indikator.get(3).setResult(0); // d
        indikator.get(4).setResult(0); // e
        indikator.get(5).setResult(0); // f
        indikator.get(6).setResult(0); // g
        indikator.get(7).setResult(1); // h
    }

    public void setIndikatorFour(){
        indikator.get(0).setResult(0); // a
        indikator.get(1).setResult(1); // b
        indikator.get(2).setResult(1); // c
        indikator.get(3).setResult(0); // d
        indikator.get(4).setResult(0); // e
        indikator.get(5).setResult(0); // f
        indikator.get(6).setResult(0); // g
        indikator.get(7).setResult(1); // h
    }

    public void setIndikatorFive(){
        indikator.get(0).setResult(0); // a
        indikator.get(1).setResult(1); // b
        indikator.get(2).setResult(1); // c
        indikator.get(3).setResult(0); // d
        indikator.get(4).setResult(0); // e
        indikator.get(5).setResult(0); // f
        indikator.get(6).setResult(0); // g
        indikator.get(7).setResult(1); // h
    }

    public void setIndikatorSix(){
        indikator.get(0).setResult(0); // a
        indikator.get(1).setResult(1); // b
        indikator.get(2).setResult(1); // c
        indikator.get(3).setResult(0); // d
        indikator.get(4).setResult(0); // e
        indikator.get(5).setResult(0); // f
        indikator.get(6).setResult(0); // g
        indikator.get(7).setResult(1); // h
    }

    public void setIndikatorSeven(){
        indikator.get(0).setResult(1); // a
        indikator.get(1).setResult(1); // b
        indikator.get(2).setResult(1); // c
        indikator.get(3).setResult(0); // d
        indikator.get(4).setResult(0); // e
        indikator.get(5).setResult(0); // f
        indikator.get(6).setResult(0); // g
        indikator.get(7).setResult(1); // h
    }


    public void echoIndikator() {
        // 1
        if (indikator.get(0).getResult() == 0) {
            System.out.println(" ");
        } else {
            System.out.println(" ---- ");
        }

        // 2
        if (indikator.get(5).getResult() == 1) {
            System.out.print(" |  ");
        } else {
            System.out.print("    ");
        }

        if (indikator.get(1).getResult() == 1) {
            System.out.println(" |");
        } else {
            System.out.println("  ");
        }

        // 3
        if (indikator.get(6).getResult() == 0) {
            System.out.println(" ");
        } else {
            System.out.println(" ---- ");
        }

        // 4
        if (indikator.get(4).getResult() == 1) {
            System.out.print(" |  ");
        } else {
            System.out.print("    ");
        }

        if (indikator.get(2).getResult() == 1) {
            System.out.println(" |");
        } else {
            System.out.println("  ");
        }

        // 3
        if (indikator.get(3).getResult() == 0) {
            System.out.println(" ");
        } else {
            System.out.println(" ---- ");
        }

        System.out.println("\n************************\n");
    }
}
