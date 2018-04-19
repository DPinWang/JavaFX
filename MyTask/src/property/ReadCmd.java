package property;

import javafx.concurrent.Task;

import java.util.Scanner;

/**
 * Created by wdphu on 2018/4/19.
 */
//public class ReadCmd extends Thread{
//    @Override
//    public void run(){
//        startRead();
//    }
public class ReadCmd{
    private String cmd;

    public String getCmd(){
        System.out.println("cmd : " + cmd);
        return cmd;
    }
    public void startRead(){
        Scanner scanner = new Scanner(System.in);
        String cmd = null;

        while ((cmd = scanner.nextLine()) != null){
            System.out.println("cmd is " + cmd);
            switch (cmd){
                case "add":
                    doAdd();
                    break;
                case "sub":
                    doSub();
                    break;
                case "mul":
                    doMul();
                    break;
                case "div":
                    doDiv();
                    break;
                default:
                    break;
            }
        }
    }

    public String doAdd(){
        cmd = "add";
        System.out.println("called add");
        return "add";
    }

    public String doSub(){
        System.out.println("called sub");
        cmd = "sub";
        return "sub";
    }

    public String doMul(){
        cmd = "mul";
        return "mul";
    }

    private String doDiv(){
        cmd = "div";
        return "div";
    }
}
