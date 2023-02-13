package seminar2;

// Задача 1. Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.


// import java.io.IOException;
// import java.util.logging.FileHandler;
// import java.util.logging.Logger;
// import java.util.logging.SimpleFormatter;
// import java.util.Arrays;

// public class sem2{
//     public static void main(String[] args) throws SecurityException, IOException{
    
//         Logger logger = Logger.getLogger(sem2.class.getTypeName());
//         FileHandler fh = new FileHandler
//         ("c:\\Users\\Alexsandra\\Desktop\\java\\seminar2\\sortlog.txt"); 
       
//         logger.addHandler(fh);
//         SimpleFormatter sFormat = new SimpleFormatter();
//         fh.setFormatter(sFormat);

//         int[] arr = {5, 8, 3, 4, 4, 1, 2};
 
//         boolean logic = false;
//         int temp;
//         while(logic == false) {
//             logic = true;
//             for (int i = 0; i < arr.length-1; i++){
//                 if(arr[i] > arr[i+1]){
//                     logic = false;
//                     temp = arr[i];
//                     arr[i] = arr[i+1];
//                     arr[i+1] = temp;
//                 }
//                 logger.info(Arrays.toString(arr));
//             }
//         }
//         System.out.println(Arrays.toString(arr));   
//     }
// }



// Задача 2. Дана json строка (читать из файла и сохранить в файл) (ЕСЛИ НЕ ПОЛУЧАЕТСЯ JSON, то сделайте получение через обычный текстовый файл!!!)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова",
// "оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

// Если .txt
// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.


// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.IOException;

// public class sem2 {
//     public static void main(String[] args) throws SecurityException, IOException 
//     {
//         int size = 0;
//         try (BufferedReader bufferedReader = new BufferedReader(new FileReader
//         ("c:\\Users\\Alexsandra\\Desktop\\java\\seminar2\\students.txt"))){ 
//             while (bufferedReader.readLine() != null){ 
//                 size += 1; 
//             }
//         }   catch (IOException e){ 
//             e.getMessage(); 
//         }

//         String[] listData = new String[size];
//         try (BufferedReader bufferedReader = new BufferedReader
//         (new FileReader("c:\\Users\\Alexsandra\\Desktop\\java\\seminar2\\students.txt"))){
//             String str;
//             int i = 0;
//             while ((str = bufferedReader.readLine()) != null){
//                 listData[i] = str;
//                 i++;
//             }
//         } catch (IOException e){
//             e.getMessage(); 
//         }

//         System.out.println("вывод: ");
//         for (int i = 0; i < listData.length; i++){ 
//                 System.out.println(resultText(listData[i])); 
//             }
             
//     }
//     public static StringBuilder resultText(String line){
//         StringBuilder result = new StringBuilder("");
//         String line_one = line.replace("{", "");
//         String line_two = line_one.replace("}", "");
//         String line_three = line_two.replace("\"", "");
//         String[] arrayData = line_three.split(",");
//         String[] listName = {"Студент ", " получил(a) ", " по предмету "};
//         for (int i = 0; i < arrayData.length; i++){
//             String[] arrData = arrayData[i].split(":");
//             result.append(listName[i]);
//             result.append(arrData[1]);
//         }
//         return result;
//     }
// }


//Задача 3. Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).

// import java.util.Scanner;

// public class sem2 {
//     public static void main(String[] args){
//         Scanner iScanner = new Scanner(System.in, "Cp866");
//         System.out.println("Введите строку: ");
//         String user_input = iScanner.next();
//         iScanner.close();

//         System.out.println(polindrom(user_input));
//     }
    
//     public static boolean polindrom(String args){
//         for (int i = 0; i < args.length(); i++) {
//             if (args.charAt(i) != args.charAt(args.length() - 1 - i)) return false;
//         }
//         return true;
//     }
// }