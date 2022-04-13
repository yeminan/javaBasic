package Confirm;
public class MySqlDaoEx implements DataAccessObject {
@Override
public void select() {
System.out.println("My Sql DB 생성");	
}
@Override
public void insert() {
System.out.println("My Sql DB 삽입");	
}
@Override
public void update() {
System.out.println("My Sql DB 수정");
}
@Override
public void delete() {
System.out.println("My Sql DB 삭제");	
}

}
