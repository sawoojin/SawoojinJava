package org.ajoo.day10.oop.member.controller;

import java.util.ArrayList;
import java.util.List;

import org.ajoo.day09.collection.member.model.vo.Member;

public class MemberController {
	
	List<Member> members;
	
	public MemberController() {
		members = new ArrayList<Member>();
	}
	public void addMember(Member member) {
		members.add(member);
	}
	public void updateMember(String memberId, Member updateMember) {
//		return members;
		for (int i = 0; i < members.size(); i++) {
			Member member = members.get(i);
			if (member.getMemberId().equals(memberId)) {
				member.setMemberPw(updateMember.getMemberPw());
				member.setMemberEmail(updateMember.getMemberEmail());
				member.setMemberEmail(updateMember.getMemberEmail());
			}
			members.set(i, member);
		}
    }
	public void deleteMember(Member member) {
		members.remove(member);
	}
	public List<Member> findMember() {
		return members;
	}
	public List<Member> findAllMember() {
		return members;
	}
}