import java.util.Scanner;
import java.sql.*;

public class SURVEY_PRAC {

    public static void Survey(Statement statement){
        Scanner scanner = new Scanner(System.in);

        try {

          // 이름과 생년월일 입력 받기
             System.out.println("1. 이름을 입력해주세요 : ");    
             System.out.print("이름) ");
             String surveyor_Name = scanner.nextLine();
             System.out.println("2. 생년월일을 입력해주세요 : ");
             System.out.print("생년월일) ");
             String surveyor_Birth = scanner.nextLine();
   
             String query0 = "INSERT INTO surveyor(NAME, BIRTH_DATE)  VALUE ('"+surveyor_Name+"', '"+surveyor_Birth+"')";  
             statement.execute(query0);
              // 여기까지 p를 선택하고 이름, 생일 입력받고 그 값을 테이블에 추가

              

        // 설문 입력 받기
        // 3번
        while(true){

            System.out.println("3. 반려동물에 관심이 있나요?");
         System.out.println("(1) 매우 그렇다"+ " (2) 그렇다" + " (3) 그렇지 않다" + " (4) 전혀 그렇지 않다");
            
         //---------------------------------------------------------------------------------------------------------------------
            String number3 = scanner.nextLine();    //  --> 인트를 스트링으로 변경
            if("1,2,3,4".equals(number3)){
            String query = "SELECT MAX(UNIQUE_ID) FROM surveyor";    // surveyor을 불러오고   UNIQUE_ID_SURVEYOR  설문자 대표값은 항상 최대값이 최신 
            String query2 = "SELECT UNIQUE_ID FROM survey_list WHERE UNIQUE_ID = 'S1'";    // 질문 리스트의대표값 불러오기
    
            
            ResultSet resultSet = statement.executeQuery(query);    //resultSet에 값을 담고      
            ResultSet resultSet2 = statement.executeQuery(query2) ;   // s1 지정한 값을 담고
            
            
            resultSet.next();    // UNIQUE_ID_SURVEYOR 의 최대값이 그냥은 지정이 안되서 next를 사용해 지정.
            
            String UNIQUE_ID_surveyor = resultSet.getString("MAX(UNIQUE_ID)");   // 
            String UNIQUE_ID_survey_list = resultSet2.getString("UNIQUE_ID");   // 
            String UNIQUE_ID_question_answer = "C" + number3;
    
    
            query = "INSERT INTO result (UNIQUE_ID_SURVEY_LIST, UNIQUE_ID_SURVEYOR, UNIQUE_ID_QUESTION_ANSWER) VALUE ('"+UNIQUE_ID_survey_list +"','"+UNIQUE_ID_surveyor+"', '"+ UNIQUE_ID_question_answer+"' )";  //여기에 UNIQUE_ID를 넣으려면 SURVEYOR에서 UNIQUE_ID값을 받아 넣기
                                                                                                                             //질문번호 S1( )          고객번호1234 ( )            질문의답 C1 ( )  
            statement.execute(query); 

            break;
            } else {
                System.out.println("다시 입력해주세요");
                System.out.println("\n");
                continue;
            }
        }
//----------------------------------------------------------------------------------------------------------------------------------
    
                      
            
            
        System.out.println("\n");
        
        // 4번                
        while(true){
            System.out.println("4. 반려동물을 키울 생각이 있나요?");
            System.out.println("(1) 매우 그렇다"+ " (2) 그렇다" + " (3) 그렇지 않다" + " (4) 전혀 그렇지 않다");
            
            Integer number4 = scanner.nextInt();
            
                if(number4 == 1){
                    break;
                }
                if(number4 == 2){
                    break;
                }
                if(number4 == 3){
                    break;
                }
                if(number4 == 4){
                    break;
                } else {
                    System.out.println("다시 입력해주세요");
                    System.out.println("\n");
                    continue;
                }
        }   
            System.out.println("\n");
         
        // 5번
        while(true){
            System.out.println("5. 유기동물을 입양할 생각이 있나요?");
            System.out.println("(1) 매우 그렇다"+ " (2) 그렇다" + " (3) 그렇지 않다" + " (4) 전혀 그렇지 않다");
            
            Integer number5 = scanner.nextInt();
            
                if(number5 == 1){
                    break;
                }
                if(number5 == 2){
                    break;
                }
                if(number5 == 3){
                    break;
                }
                if(number5 == 4){
                    break;
                } else {
                    System.out.println("다시 입력해주세요");
                    System.out.println("\n");
                    continue;
                }
        }
            System.out.println("\n");

            
         // 6번
         while(true){
            System.out.println("4. 반려동물을 키울 생각이 있나요?");
            System.out.println("(1) 매우 그렇다"+ " (2) 그렇다" + " (3) 그렇지 않다" + " (4) 전혀 그렇지 않다");
            
            Integer number6 = scanner.nextInt();
            
                if(number6 == 1){
                    break;
                }
                if(number6 == 2){
                    break;
                }
                if(number6 == 3){
                    break;
                }
                if(number6 == 4){
                    break;
                } else {
                    System.out.println("다시 입력해주세요");
                    System.out.println("\n");
                    continue;
                }
        }
        System.out.println("\n");    
         
        // 7번
        while(true){
            System.out.println("7. 반려동물이 삶의 만족도에 영향을 준다고 생각하시나요?");
            System.out.println("(1) 매우 그렇다"+ " (2) 그렇다" + " (3) 그렇지 않다" + " (4) 전혀 그렇지 않다");
            
            Integer number7 = scanner.nextInt();
            
                if(number7 == 1){
                    break;
                }
                if(number7 == 2){
                    break;
                }
                if(number7 == 3){
                    break;
                }
                if(number7 == 4){
                    break;
                } else {
                    System.out.println("다시 입력해주세요");
                    System.out.println("\n");
                    continue;
                }
        }
            System.out.println("\n");  
        
        
        // scanner.close();

    } catch (SQLException exception) {
        exception.printStackTrace();

    }

        

    }
}

        
    

            
        

        
    



    

