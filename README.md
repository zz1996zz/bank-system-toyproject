# bank-system-toyproject

## Description  
- 데이터베이스에 있는 들어있는 계좌 정보를 가지고 계좌 조회, 계좌 이체, 계좌 이체 결과를 할 수 있다.
  - 계좌 조회 : 계좌번호를 통해 조회한다.
  - 계좌 이체 : A은행에서 B은행으로 돈을 송금한다.
  - 계좌 이체 결과 : A은행과 B은행의 계좌를 조회하여 보여준다.

## Environment
- Eclipse
- H2 database
- Spring
- MyBatis
- JSP

## Files
- `sql-map-config(mybatis).xml`
  - MyBatis 컨테이너의 구성정보를 가지고 있다.
- `KBStarbank-mapping(mybatis).xml` `Wooribank-mapping(mybatis).xml`
  - SQL문을 가지고 있다.
- `business-layer.xml`
  - 빈 생성과 DB설정, 트랜잭션 설정등이 포함되어있다.

## Usage
- H2 database와 톰캣이 설치되어 있어야한다.
  - 프로젝트 만들 당시 톰캣 9.0 버전을 사용하였다.
- 추가 후에 H2 database가 설치된 위치에 bin폴더안의 h2w.bat파일을 실행시켜 DB 엔진을 실행시킨다.
- 실행 후에 create_data.sql 파일에 있는 sql문을 실행하여 테이블을 만든다.
  - 테이블안에 값도 넣어야한다.
- 설정 후에 톰캣과 프로젝트를 연결후에 실행시키면 된다.