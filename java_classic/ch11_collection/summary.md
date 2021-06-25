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

#4. LinkedList
