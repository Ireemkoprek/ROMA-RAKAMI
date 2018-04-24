/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package irem;

import javax.swing.JOptionPane;

/**
 *
 * @author irem
 */
public class Irem {
    
    public static void main(String[] args) {
        // TODO code application logic here
    
       String girdi , rakam2;
       int deger1=0;
       int deger2=0;
       int temp=0;
       int a;
       
       girdi = JOptionPane.showInputDialog("Birinci Roma rakamı: ");
       //rakam2 = JOptionPane.showInputDialog("İkinci Roma rakamı: ");
       for(a=0;a<girdi.length();a++){
           switch(girdi.charAt(a)){             
               case 'X':
                   if(temp<10){
                       deger1 = deger1 + 10 - (temp*2);
                       temp = 10;
                   }else{
                       deger1 += 10;
                       temp = 10;
                   }
                   break;
               case 'V':
                   if(temp<5){
                       deger1 = deger1 + 5 - (temp*2);
                       temp = 5;
                   }else{
                       deger1 += 5;
                       temp = 5;
                   }
                   break;
               case 'I':
                   if(temp<1){
                       deger1 = deger1 + 1 - (temp*2);
                       temp = 1;
                   }else{
                       deger1 += 1;
                       temp = 1;
                   }
                   break;
                case 'L':
                   if(temp<50){
                       deger1 = deger1 + 50 - (temp*2);
                       temp = 50;
                   }else{
                       deger1 += 50;
                       temp = 50;
                   }
                   break;
                case 'C':
                   if(temp<100){
                       deger1 = deger1 + 100 - (temp*2);
                       temp = 100;
                   }else{
                       deger1 += 100;
                       temp = 100;
                   }
                   break;
                case 'D':
                   if(temp<500){
                       deger1 = deger1 + 500 - (temp*2);
                       temp = 500;
                   }else{
                       deger1 += 500;
                       temp = 500;
                   }
                   break;
                case 'M':
                   if(temp<1000){
                       deger1 = deger1 + 1000 - (temp*2);
                       temp = 1000;
                   }else{
                       deger1 += 1000;
                       temp = 1000;
                   }
                   break;   
                   
               default :
                   System.out.println("roma rakamı girmediniz.");   
           }
       }
           
           temp = 0;
           //burası
           rakam2 = JOptionPane.showInputDialog("ikincii Roma rakamı: ");
       //rakam2 = JOptionPane.showInputDialog("İkinci Roma rakamı: ");
       for(a=0;a<rakam2.length();a++){
           switch(rakam2.charAt(a)){             
               case 'X':
                   if(temp<10){
                       deger2 = deger2 + 10 - (temp*2);
                       temp = 10;
                   }else{
                       deger2 += 10;
                       temp = 10;
                   }
                   break;
               case 'V':
                   if(temp<5){
                       deger2 = deger2 + 5 - (temp*2);
                       temp = 5;
                   }else{
                       deger2 += 5;
                       temp = 5;
                   }
                   break;
               case 'I':
                   if(temp<1){
                       deger2 = deger2 + 1 - (temp*2);
                       temp = 1;
                   }else{
                       deger2 += 1;
                       temp = 1;
                   }
                   break;
                case 'L':
                   if(temp<50){
                       deger2 = deger2 + 50 - (temp*2);
                       temp = 50;
                   }else{
                       deger2 += 50;
                       temp = 50;
                   }
                   break;
                case 'C':
                   if(temp<100){
                       deger2 = deger2 + 100 - (temp*2);
                       temp = 100;
                   }else{
                       deger2 += 100;
                       temp = 100;
                   }
                   break;
                case 'D':
                   if(temp<500){
                       deger2 = deger2 + 500 - (temp*2);
                       temp = 500;
                   }else{
                       deger2 += 500;
                       temp = 500;
                   }
                   break;
                case 'M':
                   if(temp<1000){
                       deger2 = deger2 + 1000 - (temp*2);
                       temp = 1000;
                   }else{
                       deger2 += 1000;
                       temp = 1000;
                   }
                   break;   
                   
               default :
                   System.out.println("roma rakamı girmediniz.");                   
       }
           
        
    } 
       
       int toplam = deger1 + deger2;
       int kalan = toplam,tekrar=0;
       String roma = "";
       
       int[] degerler = {1000,500,100,50,10,5,1};
       char[] rom = {'M','D','C','L','X','V','I'};
       
       int b;
       for(a=0;a<7;a++){
           for(b=6;b>a;b--){
               if(kalan==degerler[a]-degerler[a+1]){
                   roma += rom[a+1] + rom[a];
                   kalan = kalan  - (degerler[a]-degerler[a+1]);
                   break;
               }
           }
           if(kalan==0){
               break;
           }
           tekrar = kalan / degerler[a];
           int i;
           for(i=0;i<tekrar;i++){
               roma += rom[a];
               kalan -= degerler[a];
           }
           
       }
       
       System.out.println(roma);
       
       
    
    }
    
    
    
    
}
