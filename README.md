## 환율 계산기

### 기능 요구사항
* 클라이언트 요구사항
  * 수취국가는 select box를 통해서 선택한다.
  * 수취국가 선택 시 환율 정보가 변경된다.
    * 환율 포맷 x,xxx.xx 수취국가/송금국가
  * Submit 버튼을 클릭 시 수취금액을 계산한다.

* 백엔드 요구사항
  * 수취국가와 환율을 제공한다.
    * 환율 정보는 https://currencylayer.com/ 이용해서 가져온다.
    * 수취국가는 KRW, JPY, PHP만 보여준다.
    * 환율은 소수점 2자리까지 보여준다.

### API
* 수취국가와 환율을 가져오는 API
- request: 
```
GET /countries // TODO

// response
{
  list: [{
    country: KRW
    exchange: 1119.93
  },{
    country: JPY
    exchange: 1119.93
  }]
}
```

### 프로그래밍 요구사항
* 한 메서드에 오직 한 단계의 들여쓰기(indent)만 한다.
* else 예약어를 쓰지 않는다.
* 조건문은 if로 통일한다.
* 최대한 TDD 사이클을 유지한다.