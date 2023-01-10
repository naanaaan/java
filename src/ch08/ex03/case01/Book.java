package ch08.ex03.case01;

import java.time.LocalDate;
import java.util.Objects;
// record하나가 하나으 ㅣ데이터 상수랑 비슷 한번 필드값넣음 못바꿈
public record Book(String title, int price, LocalDate printedDate) {
	public Book{
		Objects.requireNonNull(title);
		Objects.requireNonNull(printedDate);
//		null값이 들어오는 것이 싫으면 위 방법을 쓴다.
	}
}
