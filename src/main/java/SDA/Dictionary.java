package SDA;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
    private Map<String, String> dictionary = new HashMap<>();
    private Map<String, List<String>> dictionaryNew = new HashMap<>();

    public void putNew(String pl, String tmp){
        for(String s : dictionary.keySet()){
            if(s.equals(pl)) {
                break;
            }
        }
        dictionary.put(pl,tmp);
    }

    public void showDictionary(){
        for (String s: dictionary.keySet()){
            System.out.println(s + " - " + dictionary.get(s));
        }
    }

    public void getTranslaton(String s){
        System.out.println(dictionary.get(s));
    }


    public void edit(String pl, String tmp){
        for(String s : dictionary.keySet()){
            if(s.equals(pl)) {
                dictionary.remove(s);
                break;
            }
        }
        dictionary.put(pl,tmp);
    }

    public void remove(String pl){
        for(String s : dictionary.keySet()){
            if(s.equals(pl)) {
                dictionary.remove(s);
                break;
            }
        }
    }

    public String[] getAll(){
        String [] list = new String[dictionary.keySet().size()];
        list = (String[])dictionary.keySet().toArray();
        return list;
    }

    public void search(String pl){
        for(String s : dictionary.keySet()) {
            if (s.contains(pl)) {
                dictionary.get(pl);
            }
        }
    }

 }
