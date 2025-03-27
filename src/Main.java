public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;

        System.out.println("Ф. И. О. сотрудника — " + fullName);

        System.out.println("Задача 2");
        String fullNameOne = "Ivanov Ivan Ivanovich";
        String fullNameTwo = fullNameOne.toUpperCase();

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullNameTwo);

        System.out.println("Задача 3");
        String fullNameThree = "Иванов Семён Семёнович";
        String fullNameFour = fullNameThree.replace('ё', 'е');

        System.out.println("Данные Ф. И. О. сотрудника — " + fullNameFour);
    }
}