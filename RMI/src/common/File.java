/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.StringJoiner;

/**
 *
 * @author yuchen
 */
public class File {
    private final String name;
    private final Integer size;
    private final String owner;
    private final Boolean readOnly;
    
    File(String name, Integer size, String owner, Boolean readOnly) {
        this.name = name;
        this.size = size;
        this.owner = owner;
        this.readOnly = readOnly;
    }
    
    public String fileToString(){
        StringJoiner fileString = new StringJoiner("#");
        fileString.add(this.name);
        fileString.add(this.size+"");
        fileString.add(this.owner);
        fileString.add(this.readOnly+"");
        return fileString.toString();
    }
}
