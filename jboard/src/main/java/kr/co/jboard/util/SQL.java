package kr.co.jboard.util;

public class SQL {

	// Article
	public static final String INSERT_ARTICLE = "insert into Article set "
															+ "type='free',"
															+ "title=?,"
															+ "content=?,"
															+ "file=?,"															
															+ "writer=?,"
															+ "regip=?,"
															+ "wdate=now()";
	
	public static final String SELECT_ARTICLE = "select a.*, "
												+ "	u.nick, "
												+ "	f.* "
												+ "from article as a "
												+ "left join file as f on a.ano = f.ano "
												+ "join user as u on a.writer = u.userid "
												+ "where a.ano=? ";
	public static final String SELECT_MAX_ANO = "select max(ano) from Article";
	public static final String SELECT_COUNT_ARTICLE = "select count(*) from article";
	public static final String SELECT_ALL_ARTICLE = "SELECT a.*, u.nick FROM Article AS a "
													+ "JOIN User AS u "
													+ "ON a.writer = u.userid "
													+ "ORDER by ano desc "
													+ "limit ?, 10";
	public static final String SELECT_COUNT_ARTICLE_JOIN = "SELECT COUNT(*) FROM Article AS a "
															+ "JOIN User AS u ON a.writer = u.userid ";
	public static final String SELECT_ALL_ARTICLE_JOIN = "SELECT a.*, u.nick FROM Article AS a "
			+ "JOIN User AS u ON a.writer = u.userid ";

	public static final String WHERE_TITLE_KEYWORD = "where title like ? ";

	public static final String WHERE_CONTENT_KEYWORD = "where content like ? ";

	public static final String WHERE_NICK_KEYWORD = "where nick like ? ";
	
	public static final String ORDER_LIMIT = "order by ano desc limit ?, 10";

	public static final String UPDATE_ARTICLE = "update Article set "
															+"title=?,"
															+"content=? "
															+"where ano=?";
	public static final String UPDATE_ARTICLE_HIT = "update Article set "
															+"hit = hit + 1 "
															+"where ano=?";
	public static final String DELETE_ARTICLE = "delete from Article where ano=?";
	
	// User
	public static final String INSERT_USER = "insert into User set "
														+ "userid=?,"
														+ "pass=SHA2(?, 256),"
														+ "name=?,"
														+ "nick=?,"
														+ "email=?,"
														+ "hp=?,"
														+ "zip=?,"
														+ "addr1=?,"
														+ "addr2=?,"
														+ "regip=?,"
														+ "regDate=now()";
	public static final String SELECT_USER = "select * from User where userid=?";
	public static final String SELECT_COUNT_USER = "select count(*) from User ";	
	public static final String WHERE_USERID = "where userid=?";	
	public static final String WHERE_NICK = "where nick=?";	
	public static final String WHERE_EMAIL = "where email=?";	
	public static final String WHERE_HP = "where hp=?";	
	public static final String SELECT_USER_WITH_PASS = "select * from User where userid=? and pass=SHA2(?, 256)";
	public static final String SELECT_ALL_USER = "select * from User";
	public static final String UPDATE_USER = "update User set "
														+ "pass=?,"
														+ "name=?,"
														+ "nick=?,"
														+ "email=?,"
														+ "hp=?,"
														+ "role=?,"
														+ "zip=?,"
														+ "addr1=?,"
														+ "addr2=? "
														+ "where userid=?";
	public static final String DELETE_USER = "delete from User where userid=?";
	
	// File
	public static final String INSERT_FILE = "insert into File set "
														+ "ano=?,"
														+ "oname=?,"
														+ "sname=?,"
														+ "rdate=now()";
	public static final String SELECT_FILE = "select * from File where fno=?";
	public static final String SELECT_ALL_FILE = "select * from File";
	public static final String UPDATE_FILE = "update File set "
														+"oname=?,"
														+"sname=? "
														+"where fno=?";
	public static final String DELETE_FILE = "delete from File where fno=?";
	
	// Comment
	public static final String INSERT_COMMENT = "insert into Comment set "
														+ "parent=?,"
														+ "content=?,"
														+ "writer=?,"
														+ "regip=?,"
														+ "wdate=now()";
	public static final String SELECT_COMMENT = "select * from Comment where cno=?";
	public static final String SELECT_ALL_COMMENT = "select * from Comment where parent=?";
	public static final String UPDATE_COMMENT = "update Comment set "
														+"content=?,"
														+"writer=?,"
														+"regip=? "
														+"where cno=?";
	public static final String DELETE_COMMENT = "delete from Comment where cno=?";
	
	// Terms
	public static final String INSERT_TERMS = "insert into Terms set "
														+ "no=?,"
														+ "basic=?,"
														+ "privacy=?";
	public static final String SELECT_TERMS = "select * from Terms where no=?";
	public static final String SELECT_ALL_TERMS = "select * from Terms";
	public static final String UPDATE_TERMS = "update Terms set "
														+"basic=?,"
														+"privacy=? "
														+"where no=?";
	public static final String DELETE_TERMS = "delete from Terms where no=?";
	
}
