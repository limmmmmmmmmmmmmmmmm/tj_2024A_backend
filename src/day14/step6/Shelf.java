package day14.step6;

import java.util.ArrayList;

public class Shelf { //선반 역할 하는 클래스

    //1. 멤버변수
    protected ArrayList<String> shelf;
        //protected vs public vs private vs 생략(default)
        //ArrayList<타입> 리스트변수명 vs 타입[] 배열변수명

    // 생성자
    public Shelf(){
        //추가적인 로직
        this.shelf = new ArrayList<String>();
    }

    //3. 메소드
    public ArrayList<String> getShelf(){
        return shelf;
    }

    public int getCount(){
        return shelf.size();
    }

}
