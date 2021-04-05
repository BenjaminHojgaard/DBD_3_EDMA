package learnedma;

import learnedma.generated.valuedomains.JSON;
import learnedma.generated.valuedomains.Optional;
import learnedma.generated.valuedomains.Person;

import java.util.List;

public class Play {
    public static void main(String[] args) {


        //Person person = Person.create().firstName("asd").lastName("").email("").mobile("");

        JSON json = JSON.create().openCurlyBracket("{").key("Key").colon(":").value("Value")
                .optionalExtras(Optional.create().comma(",").key("Key2").colon(":").value("Extra Value")).closeCurlyBracket("}");

        System.out.println(json.toString());
    }

}
