import com.zhuhui.domain.Items;
import com.zhuhui.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ssmTest {

    @Test
    public void testDao() throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationConfig_service.xml","spring/applicationConfig_dao.xml");

        ItemsService itemsService = ac.getBean(ItemsService.class);
        Items i1 = itemsService.findById(1);
        System.out.println(i1);
    }

}
