//Необхідно створити рядок із текстом
//        (текст взяти будь-який з інтернету).
//        Розбити цей рядок на 2 підрядки рівної довжині та вивести на екран кожну речення з нового рядка.

package Ex_3;

public class Main {
    public static void main(String[] args) {
        String text = "Культурных разновидностей и сортов чили более 3000. Классификация сортов жгучего перца учитывает такие характеристики, как окраска, аромат, форма и степень жгучести, которая определяется по шкале американского химика Уилбура Сковилла и оценивается в ЕСШ (единица шкалы Сковилла). Единица измерения жгучести указывает количество в том или ином сорте растения алкалоида капсаицина. Мы предлагаем вам знакомство с самыми популярными разновидностями и сортами острого перца Всё о растениях.";
        int length = text.length();

        int halfLength = length / 2;

        String firstPart = text.substring(0, halfLength);
        String secondPart = text.substring(halfLength);

        // Виведення на екран двох половин текста
        System.out.println(firstPart);
        System.out.println();
        System.out.println(secondPart);
        System.out.println();

        // Виведення кожного речення на окремому рядку
        String[] sentences = text.split("\\.");

        for (String sentence : sentences) {
            System.out.println(sentence.trim() + ".");
        }
    }
}
