# 자동차 경주 게임
## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 기능목록
1. [x] 자동차라는 객체의 기능 - 전진, 스탑
2. [x] 뷰에서 자동차를 출력할때 이름과 같이 출력하기 즉 자동차의 현재 상태를 출력하기
3. [x] 자동차 이름 검증 기능 - 자동차 이름이 잘못된 형식일때 Exception처리 - InvalidNameException
4. [x] 입력값을 파싱하는 기능
5. [x] 사용자 input 기능
6. [ ] 전진, 스탑을 결정하는 랜덤기능
7. [ ] 순위 기능 (우승자 찾기)

## 요구사항
1. [일금콜렉션](https://developerfarm.wordpress.com/2012/02/01/object_calisthenics_/): 콜렉션을 포함한 포함한 클래스는 반드시 다른 **멤버 변수**가 없어야한다.
2. [원시값,문자열 포장](https://developerfarm.wordpress.com/2012/01/27/object_calisthenics_4/): 원시값 변수로는 컴파일러와 프로그래머에게 전달할 수 있는 정보가 제한적이기 때문에, 객체로 포장하여 사용한다.

## 궁금점
1. 자동차의 상태를 바꾸는(이동,정지) 랜덤적인 요소를 제외하더라도, run stop의 메소드를 테스트하기 위해서는 package scope으로 놔야하는지? 상태를 바꾸는 메소드를 public으로 두고 싶지 않다.
2. 생성자에서 validate를 할때, 객체를 생성하고 validate를 진행해야하는데, 먼저 입력값을 validate하고 싶다면, static method를 사용해야하는건지


