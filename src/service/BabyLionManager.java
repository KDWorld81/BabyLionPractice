package service;

import model.BabyLion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BabyLionManager {
    private List<BabyLion> lions = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    //아기사자 등록
    public void registerLion(){
        System.out.print("이름 입력 :");
        String name = sc.nextLine();

        System.out.println("자기소개 입력 :");
        String selfIntro = sc.nextLine();

        System.out.println("학번 입력 :");
        int id = sc.nextInt();

        System.out.println("성실도(0~5) :");
        int good = sc.nextInt();

        BabyLion lion = new BabyLion(name,selfIntro,id,good);
        lions.add(lion);
    }
    //전체 조회
    public void viewAllLions(){
        if(lions.isEmpty()){
            System.out.println("아기사자가 존재하지 않습니다.");
        }
        else{
            for(BabyLion lion : lions){
                System.out.println(lion);
            }
        }
    }

}
