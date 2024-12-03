/* Name Surname: Nurettin Hakan SİNAL
 * Student ID: 220315099 
 *
 *
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw220315099;
import java.util.Scanner;
/**
 *
 * @author Hakan
 */
public class HW220315099 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Q1 => Question 1");
        System.out.println("Q2 => Question 2");
        System.out.println("Q3 => Question 3");
        System.out.println("Please write the code of the question: Q1 , Q2 or Q3 ");

        Scanner input = new Scanner(System.in);
        
        String inputQuest = input.nextLine().toUpperCase(); // Kullanıcıdan cevabını görmeyi istediği soru kodu alınır. => Q1 , Q2 veya Q3.
        
        if(!inputQuest.equals("Q1") && !inputQuest.equals("Q2") && !inputQuest.equals("Q3")) // Eğer istenilen kod girilmezse bilgilendirir ve hata verir.
        {
        System.out.println("Sorry, incorrect input. ");
        System.exit(1); // Hata verir ve çıkar.
        }

        
        
        
        
        //Q1------------------------------------------------------------------Q1
        if(inputQuest.equals("Q1")) // Kullanıcı eğer 1. sorunun cevabını görmek istiyorsa:
        {
                
        System.out.println("Please enter the sentence: ");
        String sentence = input.nextLine().toLowerCase(); // Kullanıcıdan mesaj alınır.
        boolean result = sentence.matches("^[ A-Za-z]+$"); // Alınan mesajda harf ve boşluk olup olmadığını kontrol eder.
       
        if (result == false) { // Eğer alınan mesajda harf ve boşluktan başka bir şey varsa istenilen cevabı alana kadar döngüye sokar.
        while (true) {
            System.out.println("Message contains non-letters, please enter a valid message: ");
            sentence = input.nextLine().toLowerCase(); // Kullanıcıdan tekrar mesaj alınır.
            result = sentence.matches("^[ A-Za-z]+$");
            if (result == true) { // Eğer alınan mesaj sadece harf ve boşluk içeriyorsa döngüden çıkılır.
                System.out.println("Valid message is entered. ");
                break; // Gerekli şart sağlanınca döngüyü kırar.
        }
        }
        }
        
        System.out.println("Please enter shift key: ");
        int shiftKey = input.nextInt(); // Kullanıcıdan key alınır.
        
        if (shiftKey < 0 || shiftKey > 25) { // Eğer key 0'dan küçük 25'ten büyükse istenilen cevabı alana kadar döngüye sokar.
        while (true) {
            System.out.println("Invalid shift key, please enter a valid shift key: ");
            shiftKey = input.nextInt(); // Kullanıcıdan tekrar key alınır.
            if (shiftKey >= 0 && shiftKey <= 25) { // Eğer key 0 ile 25 arasındaysa (0 - 25 dahil) döngüden çıkılır.
                System.out.println("Valid shift key is entered. ");
                break; // Gerekli şart sağlanınca döngüyü kırar.
        }
        }
        }
        
        String alphabet = "abcdefghijklmnopqrstuvwxyz"; // A'dan z'ye alfabeyi belirtir.
        
        String encryptSentence = ""; // Şifreli hali buraya eklenır.
        
        int i = 0;
        while (i < sentence.length()) { // Her karakteri şifrelemek için while döngüsü kullanılır.
            if(Character.isWhitespace(sentence.charAt(i))) { // Eğer mesajda boşluk varsa i kaymaması için boşluk eklenir.
                encryptSentence += " "; 
                i++;
            }    
            int position = alphabet.indexOf(sentence.charAt(i)); // Alfabe içindeki mesajın her karakterinin konumu alınır.
            int encryptPosition = (shiftKey + position) % 26; // Mesajın her karakteri için şifreli karakter elde edilir.
            
            char encryptChar = alphabet.charAt(encryptPosition);
            
            encryptSentence += encryptChar; // Şifreye şifreli karakter eklenir.
            
            i++;
        }
        
        String decryptSentence = ""; // Şifresi çözülmüş hali buraya eklenir.
        
        i = 0;
        while (i < sentence.length()) { // Her karakteri şifrelemek için while döngüsü kullanılır.
            if(Character.isWhitespace(sentence.charAt(i))) { // Eğer mesajda boşluk varsa i kaymaması için boşluk eklenir.
                decryptSentence += " "; 
                i++;
            }
            int position = alphabet.indexOf(sentence.charAt(i)); // Alfabe içindeki mesajın her karakterinin konumu alınır.
            int decryptPosition = (position - shiftKey) % 26; // Mesajın her karakteri için şifreli karakter elde edilir.
            
            if (decryptPosition < 0) { // Eğer negatifse
            decryptPosition = alphabet.length() + decryptPosition;
            }
            
            char decryptChar = alphabet.charAt(decryptPosition);
            
            decryptSentence += decryptChar; // Şifresi çözülmüş mesaja şifresi çözülmüş karakter eklenir.
            
            i++;
        }
        
        
        
        
        
        System.out.println("Please, press \"E\" to see the Encrypted Message or press \"D\" to see the Decrypted Message: ");
        char c = input.next().charAt(0); // Kullanıcıdan Encrypted veya Decrypted mesajlarından hangisini görmek istediğinin bilgisi alınır.
        c = Character.toUpperCase(c);
        
        if (c == 'E') { // Encrypted için:
        System.out.println("Encrypted Message: " + encryptSentence.toUpperCase());
        }
        else if (c == 'D') { // Decrypted için:
        System.out.println("Decrypted Message: " + decryptSentence.toUpperCase());
        }
        else { // Hatalı giriş için:
                System.out.println("Sorry, incorrect input. ");
                System.exit(1);
        }
        }
        
        
        
        
        
        
        //Q2------------------------------------------------------------------Q2
        if(inputQuest.equals("Q2")) // Kullanıcı eğer 2. sorunun cevabını görmek istiyorsa:
        {
        
        System.out.println();
        
        for (int i = 1; i <= 5; i++) { // 5 satır yazdıran döngü.
            
            for (int j = i; j<=((i*2)-1); j++) { // j'yi i'nin değerinden başlatıp i'nin 2 katının 1 eksiğine kadar yazdırır. 
                System.out.print(j); // j'yi aynı satıra yazdırır.
                //System.out.print(" ");
            }
            System.out.println(); // Bir alt satıra geçirir.
        }
        
        System.out.println();
        
        for (int i = 1; i <= 5; i++) { // 5 satır yazdıran döngü.
        
            for (int j = i; j <= 5; j++) { // j'yi i'nin değerinden başlatıp 5'e kadar yazdırır. i her döngüde birer kez arttığından dolayı j'nin başlangıcı da birer kez artar.
                System.out.print(j); // j'yi aynı satıra yazdırır.
                //System.out.print(" ");
            }
            System.out.println(); // Bir alt satıra geçirir.
        }
        
            System.out.println();
        
        for (int i = 1; i <= 9; i+=2) { // 5 satır yazdıran döngü. i 1'den başlayıp 9'a kadar ikişer kez artar.
        
            for (int j = 1; j <= i; j+=2) { // j 1'den başlayıp i'ye kadar ikişer kez artar.
                System.out.print(j*j); // j'nin karesini alır.
                System.out.print(" "); // Aralarda boşluk bırakır.
            }
            System.out.println();
        }
        
        for (int k = 7; k >= 1; k-=2) { // 4 satır yazdıran döngü. k 7'den başlayıp 1'e kadar ikişer kez azalır.
        
            for (int l = 1; l <= k; l+=2) { // l 1'den başlayıp k'ya kadar ikişer kez artar.
                System.out.print(l*l); // l'nin karesini alır.
                System.out.print(" "); // Aralarda boşluk bırakır.
            }
            System.out.println();
        }
        
        }
        
        
        
        
        
        //Q3------------------------------------------------------------------Q3
        if(inputQuest.equals("Q3")) // Kullanıcı eğer 3. sorunun cevabını görmek istiyorsa:
        {
        
            System.out.println("Please write your account number: ");
            String accountNumber = input.nextLine(); // Kullanıcıdan hesap numarası alınır.
            
            //String finalAccountNumber = "";
            
            if (accountNumber.length() != 16) { // Eğer hesap numarası 16 haneli değilse hata verip çıkar.
                System.out.println("Account number must have 16 characters ! ");
                System.exit(1);
            }
            
            if (Character.isLowerCase(accountNumber.charAt(0)) || Character.isLowerCase(accountNumber.charAt(1))) { // Eğer ilk iki hanesi büyük harfli değilse hata verip çıkar.
                System.out.println("Account number must start with two capital letters ! ");
                System.exit(1);
            }
            
            if ((int)accountNumber.charAt(0) > (int)accountNumber.charAt(1)) { // Eğer ilk hanenin ascii değeri ikinci hanenin değerinden büyükse hata verip çıkar.
                System.out.println("First letter must always be lower than the second ! ");
                System.exit(1);
            }
            
            
            
            
            
            int count = 0;
            for (int i = 1; i <= Integer.parseInt(accountNumber.substring(2,4)); i++) { // Hesap no'nun 3 ve 4. haneleri (2 haneli) asal değilse hata verir. 
                if (Integer.parseInt(accountNumber.substring(2,4)) % i == 0) { // Asal sayı yalnızca 1'e ve kendisine bölünür.
                    count++;
                }
            }
            
            if (count != 2) { // Eğer ikiden fazla böleni varsa asal değildir.
                System.out.println("Two digits after the letters must be prime numbers ! ");
                System.exit(1); // Hata verir ve çıkar.
            }
            
            /*
            int count1 = 0;
            for (int i = 1; i <= Character.digit(accountNumber.charAt(2),10); i++) {
                if (Character.digit(accountNumber.charAt(2),10) % i == 0) {
                    count1++;
                }
            }
            
            if (count1 != 2) {
                System.out.println("Two digits after the letters must be prime numbers ! ");
                //System.exit(1);
            }
            
            
            
            int count2 = 0;
            for (int i = 1; i <= Character.digit(accountNumber.charAt(3),10); i++) {
                if (Character.digit(accountNumber.charAt(3),10) % i == 0) {
                    count2++;
                }
            }
            
            if (count2 != 2) {
                System.out.println("Two digits after the letters must be prime numbers ! ");
                //System.exit(1);
            }
            */
            System.out.println();
            
            //System.out.println(accountNumber.length());
            
            int numberOfDigits = accountNumber.length(); // Hesap numarasının hane sayısı.
            
            int sumOfDoubles = 0;
            
            for (int i = 14; i >= 4; i-=2) { // i 14'ten 4'e kadar ikişer kez azalır ve çift indexleri belirler. (sağdan sola)
                //System.out.println(i);
                int x = (accountNumber.charAt(i) - '0'); // Indexlerdeki sayıları x'e atar.
                //System.out.println( accountNumber.charAt(i) - '0');
                x = x * 2; // 2 ile çarpılır.
                if (x > 9) { // Eğer x 9'dan büyük olursa:
                x = (x % 10) + (x / 10); // Elde edilen sayının basamak sayıları toplanır ve x'e atanır.
                sumOfDoubles += x; // Çift indexli x'ler toplanır.
                } 
                else {
                sumOfDoubles += x; // Çift indexli x'ler toplanır.
                }
                
               //System.out.println(sumOfDoubles);   
            }
            
            int sumOfOdds = 0;
            
            for (int i = 15; i >= 5; i-=2) { // i 15'ten 5'e kadar ikişer kez azalır ve tek indexleri belirler. (sağdan sola)
                //System.out.println(i);
                int y = (accountNumber.charAt(i) - '0'); // Indexlerdeki sayıları y'e atar.
                //System.out.println( accountNumber.charAt(i) - '0');
                sumOfOdds += y; // Tek indexli y'ler toplanır.
            
               //System.out.println(sumOfOdds);   
            }
            
            int sumOfTheResults = (sumOfDoubles + sumOfOdds); // Çift index'li sayıların toplamı ile Tek index'li sayıların toplamı toplanır.
            //System.out.println(sumOfTheResults);
            
            if (sumOfTheResults % 10 == 0) { // Eğer toplamlarından 10'a bölümünden kalan 0 ise (10'a tam bölünüyorsa):
                System.out.println("The account number: " + accountNumber + " is valid. "); // Hesap numarası geçerlidir.
            }
            else {
                System.out.println("The account number: " + accountNumber + " is invalid. "); // Hesap numarası geçerli değildir.
            }
            
        }
        
    }
    
}
