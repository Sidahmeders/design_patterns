package com.company;

import com.company.memento.Editor;
import com.company.memento.History;
import com.company.state.BrushTool;
import com.company.state.Canvas;
import com.company.state.SelectionTool;

public class Main {

    public static void main(String[] args) {
//        User user = new User("Sodium", 30);
//        user.sayHi();
//        TaxCalculator calculator = getTaxCalculator();
//        calculator.calculateTax();
//        var account = new Account();
//        account.deposit(22);
//        account.withdraw(13);
//        System.out.println(account.getBalance());
//        var mailService = new MailService();
//        mailService.sendEmail();
//        var textBox = new TextBox();
//        textBox.enable();
//        drawUIControl(new TextBox());
//        var editor = new Editor();
//        var history = new History();
//        editor.setContent("a");
//        history.push(editor.createState());
//        editor.setContent("b");
//        history.push(editor.createState());
//        editor.setContent("c");
//        editor.restore(history.pop());
//        System.out.println(editor.getContent());
        var canvas = new Canvas();
        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
//    public static TaxCalculator getTaxCalculator() {
//        return new TaxCalculator2020();
//    }

//    public static void drawUIControl(UIControl control) {
//        control.draw();
//    }

}
