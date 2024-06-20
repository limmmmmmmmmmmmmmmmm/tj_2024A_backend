/*여러줄 주석*/
# 한줄 주석
-- 한줄 주석
/*SQL질의어*/
/*
	1. 주의할점
		sql문장을 입력후 ;(세미콜론) 마침, 자바와 비슷 
        문자처리 '' 혹은 ""
        명령어/키워드 에서는 대소문자 구분을 안함. 데이터/자료는 당연히 구분함
    2. 실행
		- 명령어 단위 실행, 전체 실행
        - 명령어 단위 실행 : 실행 명령어에 커서두고 [ctrl+enter], 상단 번개모양의 
        - 전체 명령어 실행 : [crtl+shift+enter], 상단 번개 모양의 I가 없는

DDL(data Definition Language) 데이터 정의어
	1. create
		create database '새로운db명';
	2. drop
		- drop database '삭제할db명';
			- drop database if exists 삭제할db명
            
	-그외
    show 
		show databases
        show variables like 'datadir'
	use
		use 
        
DML(data Manipulation Language) 데이터 조작어

DCL(data Control Language) 데이터 제어어
*/
#1. 현재 DB SERVER 존재하는 데이터베이스 확인
show databases; 
#2. 현재 DB SERVER 존재하는 로컬(C드라이브) 위치확인
show variables like 'datadir';
#3. 현재 DB SERVER내 데이터베이스 생성
create database myDB;
#4. 데이터베이스 삭제
drop database myDB;
#4-2 만약에 해당 데이터베이스 존재하면 삭제
drop database if exists myDB;

#5. DB SERVER 에는 여러개의 데이터베이스 존재.
use myDB;


drop database if exists test2;
create database test2;
show databases; #목록 확인
show variables like 'datadir'; #로컬pc에 데이터베이스가 만들어졌는지 확인
use test2;


