package com.indus.training.pack;

public class A {

    public static void main(String args[]) {


        String word ="abcadbre";

        String[] ary = "abcadbre".split("");

        System.out.println(ary[0]);

        for(int i=0;i<ary.length;i++){
            for(int j=0;j<ary.length;j++){
                if(ary[i]==ary[j]){
                    System.out.println("repeated");
                }
                else{
                    System.out.println("not repeated.");
                }

            }

        }


        }
    }



