/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kadai03;

import java.io.PrintWriter;

/**
 *
 * @author guest1Day
 */
//以下、池田さんのcodeを参照にしています。
public class Answer {
    //Kadaiクラスのoutフィールドを使用するために設定
    private PrintWriter out;
    public void setOut(PrintWriter out) {
        this.out = out;
    }
    
    //変数名の後ろの番号は課題の番号
    public void introduce_1(){
        out.println("名前：くりた<br>");
        out.println("生年月日：1989年2月12日<br>");
        out.println("自己紹介：甘党。<br>");
    }
    public void close(){
        out.println("成功");
    }
    
    public void evenOrOdd_2(int number){
        String msg;
        if(number%2 == 0){
            msg = "偶数です";
        }else{
            msg = "奇数です";
        }
        out.println(msg);
    }
    
    public void calc_3(int num1,int num2,boolean flag){
        num1 *= num2;
        if(flag){
            num1 *= num1;
        }
        out.println(num1);
    } 
    public boolean introduce_4(){
    out.println("名前：くりた<br>");
    out.println("生年月日：1989年2月12日<br>");
    out.println("自己紹介：甘党。<br>");
    return true;
    }
    public String[] getPrifile_5(){
        String id = "1";
        String name ="Kurita";
        String birthdate = "1989/02/12";
        String address = "東京都練馬区";
        String[] prifile = {id,name,birthdate,address};
        return prifile;
    }
    
    public String[] getProfile_6(int id){
        String name = "";
        String birthdate = "";
        String address = "";
        switch(id){
            case 1:
                name = "ああああ";
                birthdate = "1999/01/01";
                address = "東京都千代田区";
                break;
                
            case 2:
                name = "いいいい";
                birthdate = "1999/01/01";
                address = "東京都港区";
                break;
                
            case 3:
                name = "うううう";
                birthdate = "1999/01/01";
                address = "東京都渋谷区";
                break;        
        }
    
    String[] profile = {name,birthdate,address};
    
    return profile;
    }
    
    //課題7
    public String[] getProfile_7(int id){
        String name = null;
        String birthdate = null;
        String address = null;
        switch(id){
            case 1:
                name = "ああああ";
                birthdate = "1999/01/01";
                address = null;
                break;
                
            case 2:
                name = "いいいい";
                birthdate = "1999/01/01";
                address = "東京都港区";
                break;
                
            case 3:
                name = "うううう";
                birthdate = null;
                address = null;
                break;        
        }
        String[] profile = {name,birthdate,address};
        
        return profile;
    }
    //課題8
    public String[] getProfile_8(int id){
        String name = null;
        String birthdate = null;
        String address = null;
        switch(id){
            case 1:
                name = "ああああ";
                birthdate = "1999/01/01";
                address = null;
                break;
                
            case 2:
                name = "いいいい";
                birthdate = "1999/01/01";
                address = "東京都港区";
                break;
                
            case 3:
                name = "うううう";
                birthdate = null;
                address = null;
                break;        
        }
        String[] profile = {name,birthdate,address};
        
        return profile;
    }
        
    
    
        
        
}
