package chapter8;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    class TelevisionTest {
        private Television television;

        @BeforeEach
        public void StartWithThis(){
            television = new Television();

        }
        @Test
        public void televisionCanBeTurnOn(){
            television = new Television();
            assertFalse(television.isOn());
            television.turnOn();
            assertTrue(television.isOn());
        }
        @Test
        public void televisionCanBeTurnOffTest(){
            television = new Television();
            assertFalse(television.isOn());
            television.turnOn();
            assertTrue(television.isOn());

            television.turnOff();
            assertFalse(television.isOn());
        }
        @Test
        public void televisionInitialChannelTest(){
            television.turnOn();
            assertEquals("AV",television.setTelevision());
        }
        @Test
        public void setChannelForMyTelevision(){
            television.turnOn();
            television.setChannel(30);
            assertEquals(30,television.getChannel());

        }
        @Test
        public void setVolumeForMyTelevision(){
            television.turnOn();
            television.setVolume(6);
            assertEquals(6,television.getVolume());
        }
        @Test
        public void televisionCanIncreaseChannelTest(){
            television.turnOn();
            for (int i = 0; i < 120; i++) {
                television.increaseChannel();
            }
            assertEquals(120,television.getChannel());

        }
        @Test
        public void televisionCanDecreaseChannelTest(){
            television.turnOn();
            for (int i = 0; i < 1; i++) {
                television.increaseChannel();
            }
            television.decreaseChannel();
            assertEquals(1,television.getChannel());

        }
        @Test
        public void televisionCanIncreaseVolumeTest(){
            television.turnOn();
            for (int i = 0; i < 7; i++) {
                television.increaseVolume();

            }
            assertEquals(7,television.getVolume());
        }
        @Test
        public void televisionCanBeDecreaseVolumeTest(){
            television.turnOn();
            for (int i = 0 ; i < 4; i++) {
                television.increaseVolume();
            }
            television.decreaseVolume();
            television.decreaseVolume();
            television.decreaseVolume();
            television.decreaseVolume();
            television.decreaseVolume();
            assertEquals(1,television.getVolume());

        }
        @Test
        public void televisionCanBeMuteAndBeUnmutedTest(){
            television.turnOn();
            for (int i = 0; i < 4 ; i++) {
                television.increaseVolume();

            }
            television.muteVolume();
            assertEquals(0,television.getVolume());
            television.unmuteVolume();
            assertEquals(4,television.getVolume());

        }

    }

