package java0806;

//import java0806.Member; 

public class MemberArrayListTest {
	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		//ȸ�� �ν��Ͻ� ����
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "�չα�");
		Member memberPark = new Member(1003, "�ڼ���");
		Member memberHong = new Member(1004, "ȫ�浿");
		
		//ArrayList�� ȸ���߰�
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		memberArrayList.showAllMember();
		memberArrayList.insertMember(memberHong, 1);
		memberArrayList.insertMember(memberPark, 1);
		memberArrayList.showAllMember(); 
//		memberArrayList.removeMember(memberHong.getMemberId());
//		memberArrayList.showAllMember(); 
//		memberArrayList.removeMember(memberHong.getMemberId());
//		memberArrayList.showAllMember(); 
//		memberArrayList.insertMember(memberPark, 1);
//		memberArrayList.showAllMember(); 
//		
//		memberArrayList.insertMember(memberPark, 0);
//		memberArrayList.insertMember(memberPark, 1);
//		memberArrayList.showAllMember(); 
		
		}
}
