#1. 컴파일 에러와 런타임 에러
- 컴파일할 때 발생 vs 실행할 때 발생
- 런타임에러는 에러와 예외로 나뉨. 에러는 수습될 수 없는 심각한 오류. 예외는 수습될 수 있는 미약한 오류.
- 에러는 어쩔 수 없지만 예외는 처리해야 한다.

#2. 예외 클래스의 계층구조
- Exception은 RuntimeException / 그 외 Exception 클래스로 나뉜다.
- RuntimeException은 프로그래머의 실수로 발생하고, 예외처리 안 해도 된다.
- Exception 클래스는 반드시 해줘야 된다.
- 예외가 발생하면 예외 인스턴스가 생성된다.

#3. finally 블럭
- 예외가 발생하건 발생하지 않건 무조건 실행된다.
- 생략 가능.
- try 또는 catch에서 return문이 있어도 finally 블럭은 수행된다.

#4. 메서드에 예외 선언하기
- void method() throws Exception1, Exception2, ... {}
- 사실 예외를 처리하는 것이 아니라 호출한 메서드로 전달해주는 것.

#5. 예외 되던지기
- 예외를 처리한 후에 다시 예외를 생성해서 호출한 메서드로 전달하는 것.
- 예외가 발생한 메서드 + 호출한 메서드, 양쪽에서 예외를 처리해야 하는 경우에 사용.
- 사용하는 경우 드물다.

#6. 사용자정의 예외 만들기
- class MyException extends Exception{ MyException(String msg) {super(msg);}}
