package org.ajoo.day09.collection.member.model.vo;

public class Member {
	private String memberId;
	private int memberPw;
	private String memberName;
	private String memberEmail;
	private int memberPhone;
	
	public Member() {}
	
	public Member(String memberId, int memberPw, String memberName, String memberEmail, int memberPhone) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberEmail = memberEmail;
		this.memberPhone = memberPhone;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public int getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(int memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public int getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(int memberPhone) {
		this.memberPhone = memberPhone;
	}
	
}
