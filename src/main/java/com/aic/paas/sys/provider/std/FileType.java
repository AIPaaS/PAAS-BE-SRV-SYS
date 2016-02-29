package com.aic.paas.sys.provider.std;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.aic.paas.sys.provider.bean.SysCode;
import com.binary.core.io.Resource;
import com.binary.core.io.ResourceResolver;
import com.binary.core.util.BinaryUtils;
import com.binary.core.util.SecurityIterator;
import com.binary.framework.exception.ServiceException;
import com.binary.json.JSON;

public class FileType {

	
	/** 以ID为键名 **/
	private static final Map<Long, FileType> ID_MAP = new HashMap<Long, FileType>();
	
	/** 以一级域名为键名 (大写) **/
	private static final Map<String, FileType> NAME_MAP = new HashMap<String, FileType>();
	
	
	static {
		initialization();
	}
	
	
	private SysCode code;
	
	
	private FileType(SysCode code) {
		this.code = code;
	}
	
	
	public Long getCode() {
		return Long.valueOf(this.code.getCode());
	}
	
	public String getName() {
		return this.code.getName();
	}
	
	
	public String getIcon() {
		return this.code.getIcon();
	}
	
	
	public String getContentType() {
		return this.code.getCustom1();
	}
	
	
	@Override
	public String toString() {
		return this.getName();
	}
	
	
	/**
	 * 初始化
	 * @param context
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static void initialization() {
		Resource res = ResourceResolver.getResource("classpath:res/filetype.properties");
		if(!res.exists()) throw new ServiceException(" is not found 'classpath:res/filetype.properties'! ");
		
		List<SysCode> list = new ArrayList<SysCode>();
		try {
			InputStream is = null;
			try {
				is = res.getInputStream();
				Properties pro = new Properties();
				pro.load(is);
				
				Iterator<String> itor = (Iterator)pro.values().iterator();
				while(itor.hasNext()) {
					String s = itor.next();
					list.add(JSON.toObject(s, SysCode.class));
				}
			}finally {
				if(is != null) is.close();
			}
		}catch(Exception e) {
			throw new ServiceException(e);
		}
		
		ID_MAP.clear();
		NAME_MAP.clear();
		
		try {
			for(int i=0; i<list.size(); i++) {
				SysCode code = list.get(i);
				Long id = Long.valueOf(code.getCode());
				String name = code.getName();
				if(name==null || (name=name.trim()).length()==0) {
					throw new ServiceException(" is empty name by id '"+id+"'! ");
				}
				
				if(NAME_MAP.containsKey(name)) {
					throw new ServiceException(" is repeated name '"+name+"'! ");
				}
				
				FileType type = new FileType(code);
				ID_MAP.put(id, type);
				NAME_MAP.put(name, type);
			}
		}catch(Exception e) {
			ID_MAP.clear();
			NAME_MAP.clear();
			throw BinaryUtils.transException(e, ServiceException.class);
		}
	}
	
		
	
	
	
	/**
	 * 跟据文件类型代码获取类型对象
	 * @param code
	 * @return
	 */
	public static FileType valueOf(Long code) {
		BinaryUtils.checkEmpty(code, "code");
		FileType type = ID_MAP.get(code);
		if(type == null) throw new ServiceException(" is wrong code '"+code+"'! ");
		return type;
	}
	
	
	
	/**
	 * 跟据文件类型名称获取类型对象
	 * @param name
	 * @return
	 */
	public static FileType valueOf(String name) {
		BinaryUtils.checkEmpty(name, "name");
		FileType type = NAME_MAP.get(name.trim().toUpperCase());
		if(type == null) throw new ServiceException(" is wrong name '"+name+"'! ");
		return type;
	}
	
	
	
	public static FileType valueOfByFileName(String fileName) {
		BinaryUtils.checkEmpty(fileName, "fileName");
		
		if((fileName=fileName.trim()).indexOf('.') > 0) {
			String suffix = fileName.substring(fileName.lastIndexOf('.')+1).trim().toUpperCase();
			FileType type = NAME_MAP.get(suffix);
			if(type != null) return type;
		}
		return OTHER();
	}
	
	
	
	/**
	 * 迭代所有枚举值
	 * @return
	 */
	public static Iterator<FileType> iterator() {
		return new SecurityIterator<FileType>(ID_MAP.values().iterator());
	}
	
	
	
	
	public static FileType DOC() { return ID_MAP.get(1l); }
	public static FileType EXE() { return ID_MAP.get(2l); }
	public static FileType CLASS() { return ID_MAP.get(3l); }
	public static FileType PDF() { return ID_MAP.get(4l); }
	public static FileType XLS() { return ID_MAP.get(5l); }
	public static FileType PPT() { return ID_MAP.get(6l); }
	public static FileType JS() { return ID_MAP.get(7l); }
	public static FileType SH() { return ID_MAP.get(8l); }
	public static FileType SWF() { return ID_MAP.get(9l); }
	public static FileType TAR() { return ID_MAP.get(10l); }
	public static FileType ZIP() { return ID_MAP.get(11l); }
	public static FileType MPGA() { return ID_MAP.get(12l); }
	public static FileType MP2() { return ID_MAP.get(13l); }
	public static FileType MP3() { return ID_MAP.get(14l); }
	public static FileType RM() { return ID_MAP.get(15l); }
	public static FileType RPM() { return ID_MAP.get(16l); }
	public static FileType RA() { return ID_MAP.get(17l); }
	public static FileType PDB() { return ID_MAP.get(18l); }
	public static FileType BMP() { return ID_MAP.get(19l); }
	public static FileType GIF() { return ID_MAP.get(20l); }
	public static FileType JPEG() { return ID_MAP.get(21l); }
	public static FileType JPG() { return ID_MAP.get(22l); }
	public static FileType JPE() { return ID_MAP.get(23l); }
	public static FileType PNG() { return ID_MAP.get(24l); }
	public static FileType TIFF() { return ID_MAP.get(25l); }
	public static FileType XBM() { return ID_MAP.get(26l); }
	public static FileType XPM() { return ID_MAP.get(27l); }
	public static FileType VRML() { return ID_MAP.get(28l); }
	public static FileType CSS() { return ID_MAP.get(29l); }
	public static FileType HTML() { return ID_MAP.get(30l); }
	public static FileType HTM() { return ID_MAP.get(31l); }
	public static FileType TXT() { return ID_MAP.get(32l); }
	public static FileType RTX() { return ID_MAP.get(33l); }
	public static FileType RTF() { return ID_MAP.get(34l); }
	public static FileType TSV() { return ID_MAP.get(35l); }
	public static FileType XSL() { return ID_MAP.get(36l); }
	public static FileType XML() { return ID_MAP.get(37l); }
	public static FileType MPEG() { return ID_MAP.get(38l); }
	public static FileType MPG() { return ID_MAP.get(39l); }
	public static FileType MPE() { return ID_MAP.get(40l); }
	public static FileType AVI() { return ID_MAP.get(41l); }
	public static FileType MOVIE() { return ID_MAP.get(42l); }
	public static FileType DOCX() { return ID_MAP.get(43l); }
	public static FileType XLSX() { return ID_MAP.get(44l); }
	public static FileType PPTX() { return ID_MAP.get(45l); }
	public static FileType OTHER() { return ID_MAP.get(46l); }
	
	
	
	
}
