package kr.co.jboard.util;

public class SQL {

	// Article
	public static final String INSERT_ARTICLE = "insert into Article set "
															+ "type='free',"
															+ "title=?,"
															+ "content=?,"
															+ "writer=?,"
															+ "regip=?,"
															+ "wdate=now()";
	
	public static final String SELECT_ARTICLE = "select * from Article where ano=?";
	public static final String SELECT_ALL_ARTICLE = "select * from Article";
	public static final String UPDATE_ARTICLE = "update Article set "
															+"title=?,"
															+"content=? "
															+"where ano=?";
	public static final String DELETE_ARTICLE = "delete from Article where ano=?";
	
	// User
	public static final String INSERT_USER = "insert into User set "
														+ "userid=?,"
														+ "pass=?,"
														+ "name=?,"
														+ "nick=?,"
														+ "email=?,"
														+ "hp=?,"
														+ "role=?,"
														+ "zip=?,"
														+ "addr1=?,"
														+ "addr2=?,"
														+ "regip=?,"
														+ "regdate=now(),"
														+ "leavedate=now()";
	public static final String SELECT_USER = "select * from User where userid=?";
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
														+ "fno=?,"
														+ "ano=?,"
														+ "oname=?,"
														+ "sname=?,"
														+ "download=?,"
														+ "rdate=now()";
	public static final String SELECT_FILE = "select * from File where fno=?";
	public static final String SELECT_ALL_FILE = "select * from File";
	public static final String UPDATE_FILE = "update File set "
														+"oname=?,"
														+"sname=? "
														+"where fno=?";
	public static final String DELETE_FILE = "delete from File where fno=?";
	
	// Comment
	public static final String INSERT_COMMENT = "insert into File set "
														+ "cno=?,"
														+ "parent=?,"
														+ "content=?,"
														+ "writer=?,"
														+ "regip=?,"
														+ "wdate=now()";
	public static final String SELECT_COMMENT = "select * from Comment where cno=?";
	public static final String SELECT_ALL_COMMENT = "select * from Comment";
	public static final String UPDATE_COMMENT = "update Comment set "
														+"content=?,"
														+"writer=?,"
														+"regip=? "
														+"where cno=?";
	public static final String DELETE_COMMENT = "delete from File where cno=?";
	
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
