# API 명세서

## 1. 일정 생성

- domain: `schedule`
- url: `http://localhost:8080/schedules`
- method: `POST`
- path: `/schedules`

### 01. 설명

등록할 일정 정보를 입력받아 새로운 일정을 생성하는 API

### 02. 요청(Request)

#### a. Parameter & Querystring

| 이름 | 데이터타입 | 설명 |
| - | - | - |
| - | - | - |

#### b. request headers

`Content-Type: application/json`

| 이름 | 데이터타입 | 설명 |
| - | - | - |
| Content-Type | String | 요청 데이터 형식 |

#### c. request body

```json
{
  "name": "사라",
  "title": "사라의 과제2",
  "content": "어렵긴하다"
}
```

| 이름 | 데이터타입 | 설명 |
| - | - | - |
| name | String | 작성자명 |
| title | String | 일정 제목 |
| content | String | 일정 내용 |

### 03. 응답(Response)

#### a. response header

| 이름 | 데이터타입 | 설명 |
| - | - | - |
| - | - | - |

#### b. response body

성공응답:

```json
{
  "id": 1,
  "name": "사라",
  "title": "사라의 과제2",
  "content": "어렵긴하다",
  "createdAt": "2026-04-13T03:33:10.233204",
  "modifiedAt": "2026-04-13T03:33:10.233204"
}
```

| 이름 | 데이터타입 | 설명 |
| - | - | - |
| id | Long | 일정 식별자 |
| name | String | 작성자명 |
| title | String | 일정 제목 |
| content | String | 일정 내용 |
| createdAt | LocalDateTime | 작성일 |
| modifiedAt | LocalDateTime | 수정일 |

- status: `201 Created`

---

## 2. 일정 전체 조회

- domain: `schedule`
- url: `http://localhost:8080/schedules`
- method: `GET`
- path: `/schedules`

### 01. 설명

등록된 전체 일정을 조회하는 API

### 02. 요청(Request)

#### a. Parameter & Querystring

| 이름 | 데이터타입 | 설명 |
| - | - | - |
| - | - | - |

#### b. request headers

| 이름 | 데이터타입 | 설명 |
| - | - | - |
| - | - | - |

#### c. request body

없음

### 03. 응답(Response)

#### a. response header

| 이름 | 데이터타입 | 설명 |
| - | - | - |
| - | - | - |

#### b. response body

성공응답:

```json
[
  {
    "id": 1,
    "name": "사라",
    "title": "사라의 과제2",
    "content": "어렵긴하다",
    "createdAt": "2026-04-13T03:33:10.233204",
    "modifiedAt": "2026-04-13T03:33:10.233204"
  }
]
```

| 이름 | 데이터타입 | 설명 |
| - | - | - |
| id | Long | 일정 식별자 |
| name | String | 작성자명 |
| title | String | 일정 제목 |
| content | String | 일정 내용 |
| createdAt | LocalDateTime | 작성일 |
| modifiedAt | LocalDateTime | 수정일 |

- status: `200 OK`

---

## 3. 일정 단건 조회

- domain: `schedule`
- url: `http://localhost:8080/schedules/{id}`
- method: `GET`
- path: `/schedules/{id}`

### 01. 설명

일정 식별자(id)를 입력받아 특정 일정 하나를 조회하는 API

### 02. 요청(Request)

#### a. Parameter & Querystring

| 이름 | 데이터타입 | 설명 |
| - | - | - |
| id | Long | 조회할 일정 식별자 |

#### b. request headers

| 이름 | 데이터타입 | 설명 |
| - | - | - |
| - | - | - |

#### c. request body

없음

### 03. 응답(Response)

#### a. response header

| 이름 | 데이터타입 | 설명 |
| - | - | - |
| - | - | - |

#### b. response body

성공응답:

```json
{
  "id": 1,
  "name": "사라",
  "title": "사라의 과제2",
  "content": "어렵긴하다",
  "createdAt": "2026-04-13T03:33:10.233204",
  "modifiedAt": "2026-04-13T03:33:10.233204"
}
```

| 이름 | 데이터타입 | 설명 |
| - | - | - |
| id | Long | 일정 식별자 |
| name | String | 작성자명 |
| title | String | 일정 제목 |
| content | String | 일정 내용 |
| createdAt | LocalDateTime | 작성일 |
| modifiedAt | LocalDateTime | 수정일 |

- status: `200 OK`

---

## 4. 일정 수정

- domain: `schedule`
- url: `http://localhost:8080/schedules/{id}`
- method: `PUT`
- path: `/schedules/{id}`

### 01. 설명

일정 식별자(id)에 해당하는 일정의 내용을 수정하는 API

### 02. 요청(Request)

#### a. Parameter & Querystring

| 이름 | 데이터타입 | 설명 |
| - | - | - |
| id | Long | 수정할 일정 식별자 |

#### b. request headers

`Content-Type: application/json`

| 이름 | 데이터타입 | 설명 |
| - | - | - |
| Content-Type | String | 요청 데이터 형식 |

#### c. request body

```json
{
  "name": "사라",
  "title": "사라의 과제2",
  "content": "어렵긴하다"
}
```

| 이름 | 데이터타입 | 설명 |
| - | - | - |
| name | String | 수정할 작성자명 |
| title | String | 수정할 일정 제목 |
| content | String | 수정할 일정 내용 |

### 03. 응답(Response)

#### a. response header

| 이름 | 데이터타입 | 설명 |
| - | - | - |
| - | - | - |

#### b. response body

성공응답:

```json
{
  "id": 1,
  "name": "사라",
  "title": "사라의 과제2",
  "content": "어렵긴하다",
  "createdAt": "2026-04-13T03:33:10.233204",
  "modifiedAt": "2026-04-13T04:10:55.100000"
}
```

| 이름 | 데이터타입 | 설명 |
| - | - | - |
| id | Long | 일정 식별자 |
| name | String | 작성자명 |
| title | String | 수정된 일정 제목 |
| content | String | 수정된 일정 내용 |
| createdAt | LocalDateTime | 작성일 |
| modifiedAt | LocalDateTime | 수정일 |

- status: `200 OK`

---

## 5. 일정 삭제

- domain: `schedule`
- url: `http://localhost:8080/schedules/{id}`
- method: `DELETE`
- path: `/schedules/{id}`

### 01. 설명

일정 식별자(id)에 해당하는 일정을 삭제하는 API

### 02. 요청(Request)

#### a. Parameter & Querystring

| 이름 | 데이터타입 | 설명 |
| - | - | - |
| id | Long | 삭제할 일정 식별자 |

#### b. request headers

| 이름 | 데이터타입 | 설명 |
| - | - | - |
| - | - | - |

#### c. request body

없음

### 03. 응답(Response)

#### a. response header

| 이름 | 데이터타입 | 설명 |
| - | - | - |
| - | - | - |

#### b. response body

성공응답:

없음

- status: `200 OK`
