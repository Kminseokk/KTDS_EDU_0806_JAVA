package java0806;
import java.util.ArrayList; // ����� Ŭ���� import
//import java0806.Member; 

public class MemberArrayList {
	private ArrayList<Member> arrayList; // ArrayList ����
	
	public MemberArrayList(){
		arrayList = new ArrayList<Member>(); //����� ������ ArrayList ����
	}
	public void addMember(Member member){ //ArrayList �� ��� �߰�
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId){ // ��� ���̵� �Ű�������, ���� ���θ� ��ȯ
		for(int i =0; i<arrayList.size(); i++){ // �ش� ���̵� ���� ����� ArrayList���� ã��
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if(tempId == memberId){ // ��� ���̵� �Ű������� ��ġ�ϸ�
				arrayList.remove(i); // �ش� ����� ����
				return true; // true ��ȯ
			}
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�"); //for �� ���� �� ���� return �� �ȵ� ���
		return false; 
	}
	
	public void insertMember(Member member, int index) {
		arrayList.add(index, member);
		
	}
	
	public void showAllMember(){//��ü ȸ���� ���
		for(Member member : arrayList){
			System.out.println(member);
		}
		System.out.println();
	}
}

