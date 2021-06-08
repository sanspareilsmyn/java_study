#1. 변수
- 클래스의 첫 글자는 항상 대문자로 한다. 여러 단어로 이루어진 이름은 단어의 첫글자를 대문자로 한다. 상수의 이름은 모두 대문자로 한다. 여러 단어로 이루어진 경우 _로 구분한다.
- 자료형은 기본형(primitive type) / 참조형(reference type) 두 가지다. 기본형 변수는 data, 참조형 변수는 memory address를 값으로 갖는다.
- 예를 들어, Date today = new Date(); 에서 today는 새로 생성된 객체 Date의 주소를 가리키는 참조 변수다.
- constant를 선언하기 위해서는 final을 붙여주면 된다. constant는 선언과 동시에 초기화를 해야 한다.
- 타입이 불일치하더라도 넓은 타입에 좁은 타입 값을 설정하는 것은 가능하다.
- 작은따옴표는 char, 큰따옴표는 String. String도 원래는 클래스라서 String name = new String("Java")와 같이 사용하는 것이 원칙이긴 하다.
- 값을 다른 형식으로 출력하고 싶으면 printf().
