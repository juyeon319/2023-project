
package kr.or.ddit.users.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.or.ddit.company.vo.InterviewSchdVO;
import kr.or.ddit.paging.vo.PaginationInfo;
import kr.or.ddit.users.vo.InterviewReviewVO;

@Mapper
public interface InterviewDAO {
	
	/**
	 * 페이징
	 */
	public int selectTotalRecord(PaginationInfo<InterviewSchdVO> paging);
	
	/**
	 * 면접일정 리스트 조회
	 */
	public List<InterviewSchdVO> selectInterviewSchdList(PaginationInfo<InterviewSchdVO> paging);

	/**
	 * 면접후기 상세보기(기웅)
	 */
	public InterviewSchdVO selectInfo(String intrNo);
}
