package org.ajoo.day09.collection.member.controller;

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
	public List<Member> updateMember() {
		return members;
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