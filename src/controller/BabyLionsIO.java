package controller;
import service.BabyLionManager;

import java.util.Scanner;

public class BabyLionsIO {

    public void run() {
        Scanner sc = new Scanner(System.in);
        BabyLionManager manager = new BabyLionManager();
        while(true){
            System.out.println("1.아기사자 등록");
            System.out.println("2.전체조회");
            System.out.println("3.개별조회");
            System.out.println("4.아기사자 자기소개 수정");
            System.out.println("5.아기사자 성실도 증감");
            System.out.println("6.종료");
            System.out.println("원하는 menu 를 입력하시오 : ");

            int menu = sc.nextInt();


            if(menu == 1) manager.registerLion(); //아기사자 등록
            if(menu == 2) manager.viewAllLions(); //아기사자 전체조회
            if(menu == 3) manager.otherviewLions(); //아기사자 개별조회(id를통한)
            if(menu == 4) manager.selfIntroFix(); //아기사자 자기소개수정
        }
    }
}
