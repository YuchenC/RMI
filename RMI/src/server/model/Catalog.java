/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.model;

import common.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;
/**
 *
 * @author yuchen
 */
public class Catalog {
    private final List<String> files = Collections.synchronizedList(new ArrayList<>());
    
    public void appendFileArray(File file){
        String element = file.fileToString();
        files.add(element);
    }
    
    public String[] getFiles() {
        return files.toArray(new String[0]);
    }
    

}
