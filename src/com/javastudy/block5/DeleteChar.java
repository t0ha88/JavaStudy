package com.javastudy.block5;

public class DeleteChar {
    private String str;
    private String toFind;
    private String toReplace;

//    public DeleteChar(String str, String toFind, String toReplace) {
//        this.str = str;
//        this.toFind = toFind;
//        this.toReplace = toReplace;
//    }

    public String deleteChar(String str, String toFind, String toReplace) {
        this.str = str;
        this.toFind = toFind;
        this.toReplace = toReplace;
        String res = this.str.replace(this.toFind, this.toReplace);
        return res;
    }
}
