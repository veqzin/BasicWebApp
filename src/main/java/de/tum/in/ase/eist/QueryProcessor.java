package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Nikola";
        } else if (query.contains("what is")) {
            return Integer.toString((Integer.parseInt(query.substring(query.indexOf("is") + 3, query.indexOf("plus") - 1)) + Integer.parseInt(query.substring(query.indexOf("plus") + 5))));
        } else {
            return "";
        }
    }
}
