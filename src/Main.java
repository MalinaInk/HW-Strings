public class Main {
    public static void main(String[] args) {
        //Задание 1
        String firstName = "Ivanov ";
        String middleName = "Ivan ";
        String lastName = "Ivanovich ";
        String foolName = firstName + middleName + lastName;
        System.out.println("ФИО сотрудника - " + foolName);
        //Задание 2
        String foolName2 = foolName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для отчета - " + foolName2);
        //Задание 3
        String foolName3 = "Иванов Семён Семёнович";
        if (foolName3.contains("ё")) {
            String newName = foolName3.replace('ё', 'е');
            System.out.println("Данные сотрудника - " + newName);
        } else {
            System.out.println("Данные сотрудника - " + foolName3);
        }

    }
}