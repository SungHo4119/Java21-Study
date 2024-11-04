# 필수) 다양한 책 분류 조건에 맞는 코드를 작성해주세요
## 세팅한 코드를 복제한 뒤, 아래 조건을 확인하고 각 코드를 복제한 파일에 작성해주세요.
### 조건1) 카테고리가 여행인 책 제목 조회
```declarative
// 카테고리가 여행인 책 제목 조회
bookList.stream().filter(book -> book.getCategory().equals("여행"))
    .forEach(f -> System.out.println("카테고리가 여행인 책 제목: " + f.getBookName()));
System.out.println();
```
 - filter()를 사용해서 book.getCategory().equals("여행") 카테고리가 “여행”인 책을 분류할 수 있습니다.
 - forEach()를 사용해서 System.out.println("카테고리가 여행인 책 제목: " + f.getBookName()) 출력할 수 있습니다.

### 조건2) 가격이 16200원 이하인 책 제목 조회
```declarative
// 가격이 16200원 이하인 책 제목 조회
bookList.stream().filter(book -> book.getPrice() <= 16200)
        .forEach(f -> System.out.println("가격 16200원 이하 책 제목: " + f.getBookName()));
System.out.println();
```
 - filter()를 사용해서 book.getPrice() <= 16200 가격이 16200원 이하인 책을 분류할 수 있습니다.
 - forEach()를 사용해서 System.out.println("가격 16200원 이하 책 제목: " + f.getBookName()) 출력할 수 있습니다.
### 조건3) 책 제목에 "경제”라는 용어가 들어간 책 제목 조회
```declarative
// 책 제목에 "경제" 라는 용어가 들어간 책 제목 조회
bookList.stream().filter(book -> book.getBookName().contains("경제"))
        .forEach(f -> System.out.println("책 제목에 '경제'가 포함된 책 제목: " + f.getBookName()));
System.out.println();
```
 - filter()를 사용해서 book.getBookName().contains("경제") 책 제목에 “경제”가 포함된 책을 분류할 수 있습니다.
 - forEach()를 사용해서 System.out.println("책 제목에 '경제'가 포함된 책 제목: " + f.getBookName()) 출력할 수 있습니다.

### 조건4) 가격이 가장 비싼 책 가격 조회
```declarative
// 가격이 가장 비싼 책 가격 조회
double maxPrice = bookList.stream().mapToDouble(Book::getPrice)
        .max().getAsDouble();
System.out.println("책 목록 중 가장 비싼 금액: " + maxPrice);
System.out.println();
```
 - mapToDouble() 를 사용해서 Book::getPrice 책의 가격을 가지고 와서 max()를 사용하여 최댓값을 구할 수 있습니다.
### 조건5) 카테고리가 IT인 책들의 가격 합 조회
```declarative
// 카테고리가 IT인 책들의 가격 합 조회
double sum = bookList.stream().filter(book -> book.getCategory().equals("IT"))
        .mapToDouble(Book::getPrice)
        .sum();
System.out.println("카테고리 IT 책들의 가격 합: " + sum);
System.out.println();
```
- filter()를 사용해서 book.getCategory().equals("IT") 카테고리가 “IT”인 책을 분류할 수 있습니다.
- mapToDouble()를 사용해서 Book::getPrice 책의 가격을 가지고 와서 sum()를 사용하여 책들의 가격 합을 구할 수 있습니다.
### IT 책 할인 이벤트!
```declarative
// IT 책 할인 이벤트!!
        // 카테고리가 IT 인 책들의 가격을 40% 할인하여 새로운 책 리스트 만들기, discountedBookList
        List<Book> discountedBookList = bookList.stream().filter(book -> book.getCategory().equals("IT"))
                .map(book -> {
                    book.setPrice(book.getPrice() * 0.6);
                    return book;
                }).toList();

//        List<Book> discountedBookList = bookList.stream().filter(book -> book.getCategory().equals("IT"))
//                .peek(book -> book.setPrice(book.getPrice() * 0.6)).toList();


        for (Book book : discountedBookList) {
            System.out.println("할인된 책 제목: " + book.getBookName());
            System.out.println("할인된 책 가격: " + book.getPrice() + "\n");
        }
```
- filter()를 사용해서 book.getCategory().equals("IT") 카테고리가 “IT”인 책을 분류할 수 있습니다.
- map()을 사용해서 책의 가격을 수정할 수 있습니다.
- toList()를 사용해서 리스트로 만들 수 있습니다.
