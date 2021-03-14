package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);

    }

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
                /*            } else if (...) { */
                /*             Добавить остальные действия системы по меню. */
            } else if (select == 1) {
                System.out.println("=== Show all items ===");
                Item[] all = tracker.findAll();
                for (int i = 0; i < all.length; i++) {
                    System.out.println(all[i]);
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ===");
                String id = scanner.nextLine();
                Item item = new Item(id);
                if (tracker.replace(item, id)) {
                    System.out.println("Успешно");
                } else {
                    System.out.println("Ошибка");
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ===");
                int id = Integer.valueOf(scanner.nextLine());
                if (tracker.delete(id)) {
                    System.out.println("Успешно");
                } else {
                    System.out.println("Ошибка");
                }


            } else if (select == 4) {
                System.out.println("=== Find item by Id ===");
                System.out.println("Enter an existing id:");
                int requestNumber = Integer.valueOf(scanner.nextLine());
                Item item = tracker.findById(requestNumber);
                if (item != null) {
                    System.out.println(item);
                } else {
                    System.out.println("Заявки с таким именем не найдены");
                }
            } else if (select == 5) {
                System.out.println("=== Find items by name ===");
                System.out.println("Enter an existing name:");
                String applicationName = scanner.nextLine();
                Item[] items = tracker.findByName(applicationName);
                if (items.length > 0) {
                    for (int i = 0; i < items.length; i++) {
                        System.out.println(items[i].toString());
                    }
                } else {
                    System.out.println("Заявки с таким именем не найдены");
                }

            } else if (select == 6) {
                run = false;
            }
        }

    }

    private void showMenu() {

        System.out.println("Menu.");
        /* добавить остальные пункты меню. */
        System.out.println("0. Add new Item\n" +
                "1. Show all items\n" +
                "2. Edit item\n" +
                "3. Delete item\n" +
                "4. Find item by Id\n" +
                "5. Find items by name\n" +
                "6. Exit Program\n" +
                "Select:");
    }


}



