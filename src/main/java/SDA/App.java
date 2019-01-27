package SDA;

import java.time.LocalDate;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

        Dictionary dictionary = new Dictionary();
        dictionary.putNew("Kot", "Cat");
        dictionary.putNew("Pies", "Dog");
        dictionary.putNew("Koń", "Horse");

        dictionary.remove("Koń");

        dictionary.showDictionary();

        PersonService personService = new PersonService();
        personService.add(new Person("Michał", "Szczepanik",LocalDate.of(1992,10,1),"micszczepanik@gmail.com","XXXXXXX"));
        personService.add(new Person("Lukasz", "Szczepanik", LocalDate.of(1994,1,1),"micszczepanik@gmail.pl", "YYYYYYYYY"));
        personService.add(new Person("Michał", "Szczepanik", LocalDate.of(1990,1,1),"micszczepanik@gmail.eu","ZZZZZZZZ"));


        personService.showDictionary();

        System.out.println(personService.log("micszczepanik@gmail.eu","ZZZZZZZ"));


    }
}
