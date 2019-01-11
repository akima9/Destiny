package com.destiny.web.info;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.destiny.common.Photo;
import com.destiny.service.community.CommunityService;
import com.destiny.service.domain.Community;

@Controller
@RequestMapping("/info/*")
public class InfoController {
	
	///Field
	@Autowired
	@Qualifier("communityServiceImpl")
	private CommunityService communityService;
	
	///Constructor
	public InfoController() {
		System.out.println(this.getClass());
	}
	
	@Value("#{commonProperties['pageUnit']}")
	int pageUnit;
	
	@Value("#{commonProperties['pageSize']}")
	int pageSize;
	
	///Method
	
	/*getRestaurantInfoList.jsp�� �ܼ� Navigation : start*/
	@RequestMapping(value="listRestaurantInfo", method=RequestMethod.GET)
	public ModelAndView listRestaurantInfo() throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("redirect:/community/getRestaurantInfoList.jsp");
		return modelAndView;
	}
	/*getRestaurantInfoList.jsp�� �ܼ� Navigation : end*/
	
	
	/*addRestaurantInfo.jsp�� �ܼ� Navigation : start*/
	@RequestMapping(value="addRestaurantInfo", method=RequestMethod.GET)
	public ModelAndView addRestaurantInfo() throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("redirect:/community/addRestaurantInfo.jsp");
		return modelAndView;
	}
	/*addRestaurantInfo.jsp�� �ܼ� Navigation : end*/
	
	/*addRestaurantInfo : start*/
	@RequestMapping(value="addRestaurantInfo", method=RequestMethod.POST)
	public ModelAndView addRestaurantInfo(@ModelAttribute("community") Community community) throws Exception{
		System.out.println(":: InfoController/addRestaurantInfo/post : ����");
		
		/*Business Logic : start*/
		community.setWriterId("kimgiyong");
		community.setCategory("RES");
		community.setUserGrade("NOR");
		/*community.setTitle(title);*/
		community.setWriterNickName("javaKing");
		/*community.setDetail(detail);*/
		community.setViews(0);
		community.setLike(0);
		community.setImportRank("N");
		community.setViewCondition("DEF");
		
		System.out.println(":: InfoController/addRestaurantInfo/post�� community : "+community);
		/*Business Logic : end*/
		
		ModelAndView modelAndView = new ModelAndView();
		communityService.addCommunity(community);
		modelAndView.setViewName("/community/addRestaurantInfoConfirm.jsp");
		return modelAndView;
	}
	/*addRestaurantInfo : end*/
	
	/*�������� ���ε� : start*/
	@RequestMapping(value="multiplePhotoUpload", method=RequestMethod.POST)
	public ModelAndView multiplePhotoUpload(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		String sFileInfo = ""; //��������
		String fileName = request.getHeader("file-name"); //���ϸ��� �޴´� = �Ϲ� ���� ���ϸ�
		String fileNameExt = fileName.substring(fileName.lastIndexOf(".")+1); //���� Ȯ����
		fileNameExt = fileNameExt.toLowerCase(); //Ȯ���ڸ� �ҹ��ڷ� ����
		String dftFilePath = request.getSession().getServletContext().getRealPath("/"); //���� �⺻���
		String filePath = dftFilePath + "resource" + File.separator + "photo_upload" + File.separator;
		File file = new File(filePath);
		if (!file.exists()) {
			file.mkdirs();
		}
		String realFileNm = "";
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
		String today = formatter.format(new java.util.Date());
		realFileNm = today+UUID.randomUUID().toString() + fileName.substring(fileName.lastIndexOf("."));
		String rlFileNm = filePath + realFileNm;
		
		/*������ ���Ͼ��� : start*/
		InputStream is = request.getInputStream();
        OutputStream os=new FileOutputStream(rlFileNm);
        int numRead;
        byte b[] = new byte[Integer.parseInt(request.getHeader("file-size"))];
        while((numRead = is.read(b,0,b.length)) != -1){
           os.write(b,0,numRead);
        }
        if(is != null) {
           is.close();
        }
        os.flush();
        os.close();
		/*������ ���Ͼ��� : end*/
		
		ModelAndView modelAndView = new ModelAndView();
		return modelAndView;
	}
	/*�������� ���ε� : end*/
	
	

}
