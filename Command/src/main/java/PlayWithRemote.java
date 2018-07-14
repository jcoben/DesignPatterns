import java.util.ArrayList;
import java.util.List;

public class PlayWithRemote {

	public static void main(String[] argv) {
		ElectronicDevice newDevice = TVRemote.getDevice();
		
		TurnTVOn onCommand = new TurnTVOn(newDevice);
		TurnTVOff offCommand = new TurnTVOff(newDevice);
		TurnTVUp volUpCommand = new TurnTVUp(newDevice);
		
		DeviceButton onPressed = new DeviceButton(onCommand);
		
		onPressed.press();
		
		onPressed = new DeviceButton(volUpCommand);
		onPressed.press();
		onPressed.press();
		onPressed.press();
		
		onPressed = new DeviceButton(offCommand);
		onPressed.press();
		
		Radio theRadio = new Radio();
		
		List<ElectronicDevice> allDevices = new ArrayList<ElectronicDevice>();
		
		allDevices.add(newDevice);
		allDevices.add(theRadio);
		
		TurnItAllOff turnOffDevices = new TurnItAllOff(allDevices);
		
		DeviceButton turnThemOff = new DeviceButton(turnOffDevices);
		
		turnThemOff.press();
		
		turnThemOff.undo();
	}
}
