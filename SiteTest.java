/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author MSI
 */

public class SiteTest {

    public static void main(String[] args) {
        String name = ("home");
        Site site = new Site(name);
        Integer option;
        do {
            System.out.println("0: quit");
            System.out.println("1: add page to current page");
            System.out.println("2: display current page");
            System.out.println("3: display site page");
            option = Input.getInteger("input option: ");
            switch (option) {
                case 1:
                    name = Input.getString("input the page name: ");
                    site.addSubpage(name);
                    break;
                case 2:
                    System.out.println(site.getCurrentPage());
                    break;
                case 3:
                    System.out.println(site);
                    break;
            }
        } while (option != 0);
    }

}
