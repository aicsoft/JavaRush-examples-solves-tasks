package com.example.javamy.Syntax.level6;

public class lekcia11_rodstven_svyazi_koshek {

    public  class Solution {

       /* public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String motherName = reader.readLine();
            Cat catMother = new Cat(motherName);

            String daughterName = reader.readLine();
            Cat catDaughter = new Cat(daughterName, catMother);

            System.out.println(catMother);
            System.out.println(catDaughter);
        }

        public static class Cat {
            private String name;
            private Cat parent;

            Cat(String name) {
                this.name = name;
            }

            Cat(String name, Cat parent) {
                this.name = name;
                this.parent = parent;
            }

            @Override
            public String toString() {
                if (parent == null)
                    return "The cat's name is " + name + ", no mother ";
                else
                    return "The cat's name is " + name + ", mother is " + parent.name;
            }*/
/*
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String grandFatherName = reader.readLine();
            Cat grandFather = new Cat(grandFatherName, Fat );

            String FatherName = reader.readLine();
            Cat catDaughter = new Cat(daughterName, catMother);

            String daughterName = reader.readLine();
            Cat catDaughter = new Cat(daughterName, catMother);

        }*/

        public static class Cat {
            private String name;
            private Cat mother;
            private Cat father;


            Cat (String name) {
                this.name = name;
            }

            Cat (String name, Cat father, Cat mother) {
                this.name = name;
                this.father = father;
                this.mother = mother;
            }


          /*  @Override
            public String toString() {
                if (father == null)
                    return "The cat's name is " + name + ", no mother ";
                else
                    return "The cat's name is " + parentGrandMother.name + ", mother is " +name ;


            }*/



        }







    }


}
