import com.zhuhui.dao.ItemsDao;
import com.zhuhui.domain.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ssmTest {

    @Test
    public void testDao() throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationConfig_dao.xml");
        ItemsDao itemsDao = ac.getBean(ItemsDao.class);
        Items item = itemsDao.findById(1);
        System.out.println(item);

    }

}
