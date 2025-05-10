package model;

public class BabyLion {
    private String name; // 이름
    private String selfIntro; // 자기소개
    private int id; // 학번
    private int good; // 성실도

    public BabyLion(String name,String selfIntro,int id, int good){
        this.name = name;
        this.selfIntro = selfIntro;
        this.id = id;
        this.good = good;
    }

    // getter & setter 로 캡슐화    
    public String getName() {return name;}
    public String getSelfIntro() {return selfIntro;}
    public int getId() {return id;}
    public int getGood() {return good;}

    public void setName(String name) {
        this.name = name;
    }
    public void setSelfIntro(String selfIntro) {
        this.selfIntro = selfIntro;
    }
    public void setGood(int good) {
        this.good = good;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "이름 : " + name + " 자기소개 : " + selfIntro + " 학번 : " + id + " 성실도 : " + good;
    }

}
