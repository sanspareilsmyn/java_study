#1. Collections Framework
- 컬렉션 : 여러 객체(데이터)를 모아 놓은 것을 의미.
- 프레임웍 : 라이브러리(기능) + 프로그래밍 방식
- 컬렉션 프레임웍 : 컬렉션(다수의 객체)를 다루기 위한 표준화된 프로그래밍 방식
- java.util 패키지에 포함됨.
- 컬렉션 클래스 : 다수의 데이터를 저장할 수 있는 클래스 (ex. Vector, ArrayList, HashSet)

#2. 컬렉션 프레임웍의 핵심 인터페이스
- List, Set, Map
- List는 순서가 있고 중복이 있는 데이터를 다룸. ArrayList, LinkedList, Stack, Vector 등
- Set는 순서가 없고 중복이 없는 데이터를 다룸. HashSet, TreeSet 등
- Map은 키와 값의 쌍으로 이루어진 데이터의 집합. 키는 중복 안 되고 값은 중복 됨. HashMap, TreeMap, Hashtable, Properties 등
- List와 Set의 공통분모를 모아서 Collections 인터페이스로 만들었음.

#3. Vector와 ArrayList
- Vector는 구버전이고 ArrayList는 Vector를 개선한 것.
- Vector는 동기화 처리가 되어 있고, ArrayList는 그렇지 않다. 싱글쓰레드 프로그래밍에서 Vector 쓰면 비효율적이다.
- JDK 1.5부터 오토박싱 기능이 추가되어서 모든 객체가 문자열로 변환되어 저장됨.
- ArrayList에 저장된 객체가 삭제될 때는 뒤에 데이터가 앞 자리로 덮어쓴다.
- 효율적으로 다 지우려면 뒤에서부터 지워야 된다.
- ArrayList의 장점 : 배열은 구조가 간단하고 access time이 짧다. 단점 : 크기를 변경할 수 없고 비순차적인 데이터의 추가, 삭제 -> 시간 많이 걸림.

#4. Enumeration, Iterator, ListIterator
- hasNext(), next()가 핵심.
- Iterator는 컬렉션에 저장된 요소들을 읽어오는 방법을 표준화한 것.
- 컬렉션에 iterator()를 호출해서 Iterator를 구현한 객체를 얻어서 사용. -> 코드 재사용성 올라감.
- ListIterator는 양방향 iterator 지원하지만 자주 사용되지는 않음.

#5. HashSet, TreeSet
- HashSet은 중복 안 된다.
- boolean add(Object o)는 저장할 객체의 equals()와 hashCode()를 호출. 이 두 메서드가 오버라이딩 되어 있어야 함.
- JDK1.8부터는 Objects.hash() 메서드를 사용하면 됨.
- hashCode()의 오버라이딩 조건
    - 동일 객체에 대해 hashCode()를 여러 번 호출해도 같은 값을 반환해야 한다.
    - equals()로 비교해서 true를 얻은 두 객체의 hashCode()값은 일치해야 한다.
    
#6. Properties
- 내부적으로 Hashtable을 사용하며, key와 value를 String으로 저장.
- 주로 애플리케이션의 환경설정에 관련된 속성을 저장하는데 사용되며 파일로부터 편리하게 값을 읽고 쓸 수 있는 메서드를 제공한다.
